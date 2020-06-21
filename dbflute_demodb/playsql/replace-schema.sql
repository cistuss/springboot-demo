
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

create table comment (
    comment_id int auto_increment not null,
    comennt_connect varchar(256),
    thread_id int not null,
    user_id int not null,

    create_datetime timestamp not null,
    update_datetime timestamp not null,

    primary key(comment_id)
);

alter table comment add constraint fk_user_user_id foreign key(user_id) references user(user_id);
alter table comment add constraint fk_thread_thread_id foreign key(thread_id) references thread(thread_id);
