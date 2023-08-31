provider "azurerm" {
  features {}
}
data "azurerm_resource_group" "imported" {
  name = "AZCPBLTYFinOps"
}
output "imported_resource_group_id" {
  value = /subscriptions/12788db4-52bf-4d95-99c1-4e26a5a9cb89/resourceGroups/AZCPBLTYFinOps
}
resource "azurerm_app_service" "example" {
  name                = "my-web-app"
  location            = "East US"  # Update with your desired Azure region
  resource_group_name = "AZCPBLTYFinOps"  # Update with your resource group name

  app_service_plan_id = azurerm_app_service_plan.example.id

  site_config {
    always_on = true
  }

  app_settings = {
    "MY_SETTING" = "my-value"
  }
}

resource "azurerm_app_service_plan" "example" {
  name                = "my-app-service-plan"
  location            = "East US"  # Update with your desired Azure region
  resource_group_name = "AZCPBLTYFinOps"  # Update with your resource group name

  sku {
    tier = "Standard"
    size = "S1"
  }
}