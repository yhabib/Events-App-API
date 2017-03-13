# API Documentation

## Paths:
* GET: `/api/events`
* GET: `/api/event/:eventId`
* GET: `/api/events/count`
* GET: `/api/locations/state`
* GET: `/api/locations/city`



## Domain Model
### Event
* `id : Long`
* `name : String`
* `eventDate : LocalDateTime`
* `eventImage : String`
* `description : String`
* `location : Location`
* `rate: Integer`

### Location
* `id : Long`
* `country : String`
* `state : String`
* `city : String`
* `postCode : Integer`
* `street : String`
* `number : Integer`


## Repository Layer

### EventRepository
* `Event findById()`

### LocationRepository


## Service Layer

### EventService
* `Event findById()`
* `List<Event> findAll()`
* `Long count()`

### LocationService
* ``