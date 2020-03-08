# Filename: main.tf
# https://medium.com/google-cloud/deploying-docker-images-to-cloud-run-using-terraform-ee8ae4ecb72e

# Deploy image to Cloud Run
resource "google_cloud_run_service" "mywebapp" {
  name     = "mywebapp"
  location = var.region
  template {
    spec {
      containers {
        image = "gcr.io/${var.project}/${var.webapp}"
      }
    }
  }
  traffic {
    percent         = 100
    latest_revision = true
  }
}


resource "google_cloud_run_service_iam_member" "editor" {
  location = google_cloud_run_service.mywebapp.location
  project = google_cloud_run_service.mywebapp.project
  service = google_cloud_run_service.mywebapp.name
  role = "roles/run.invoker"
  member = "allUsers"
}

# Return service URL
output "url" {
  value = "${google_cloud_run_service.mywebapp.status[0].url}"
}