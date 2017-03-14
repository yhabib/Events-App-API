drop table events if exists;
drop table locations if exists;

create table locations (
        id bigint generated by default as identity,
        city varchar(50) not null,
        country varchar(50) not null,
        number integer not null,
        post_code integer not null,
        state varchar(50) not null,
        street varchar(100) not null,
        primary key (id)
);

create table events (
        id bigint generated by default as identity,
        description CLOB NOT NULL,
        event_end_date timestamp,
        event_image varchar(255) not null,
        event_start_date timestamp not null,
        name varchar(50) not null,
        location_id bigint,
        rate integer,
        primary key (id)
);

alter table events 
        add constraint FK7a9tiyl3gaugxrtjc2m97awui 
        foreign key (location_id) 
        references locations;