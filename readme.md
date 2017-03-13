# API Documentation

## Paths:
* GET: `/api/events`
* GET: `/api/event/:eventId`
* GET: `/api/event/count`



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
* `List<Event> findAll()`
* `Integer count()`


## Service Layer
### EventService
* `Event findById()`
* `List<Event> findAll()`
* `Integer count()`