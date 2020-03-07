variable "project" { 
    default = "[project-id]"
}

variable "region" {
  default = "us-west1"
}

variable "zone" {
  default = "us-west1-a"
}

variable "machine_type" {
  type = "map"
  default = {
    dev = "f1-micro"
    prod = "n1-standard-1"
  }
}



variable "webapp"{
    default = "spring-gcp-run:1.0.0"
}


