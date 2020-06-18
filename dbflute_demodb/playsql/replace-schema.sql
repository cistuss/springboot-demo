
create table user (
  user_id int auto_increment not null,
  user_name varchar(32) not null,
  password varchar(64) not null,

  create_datetime timestamp not null,
  update_datetime timestamp not null,
  primary key(user_id)
);

create table thread(
    thread_id int auto_increment not null,
    thread_title varchar(256) not null,

    create_datetime timestamp not null,
    update_datetime timestamp not null,
    primary key(thread_id)
);
