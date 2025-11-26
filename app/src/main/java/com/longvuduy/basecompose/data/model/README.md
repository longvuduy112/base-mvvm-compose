# Model Folder Structure (as of December 23, 2025)

This folder organizes models by their data source and purpose, following MVVM best practices:

## remote/
- Contains models for API requests and responses.
- Subfolders:
  - request/: DTOs for API requests (e.g., LoginBody)
  - response/: DTOs for API responses (e.g., LoginResponse, PhoneValidationResponse)

## database/
- Contains models for local database entities (e.g., Room entities).
- Example: PhoneNumberEntity

## domain/
- Contains domain/business models used in ViewModel and Repository layers.
- Example: LoginModel, PhoneValidationModel, UserToken

## Mapping
- Use mappers/converters to transform between remote, database, and domain models.

## Best Practices
- Do not use remote/database models directly in UI or business logic.
- Always convert to domain models for use in ViewModel and Repository.
- Keep model types separated for maintainability and clarity.

