create table board (
	id serial not null,
	title varchar(100) not null,
	content text not null,
	writer varchar(20) not null,
	hits int not null,
	delete_yn char default 'N' not null,
	created_date TIMESTAMP(0) not null,
	modified_date TIMESTAMP(0),
	primary key (id)
);

create table member(
	id serial PRIMARY KEY,
	email varchar(50) not null,
	password varchar(300) not null,
	role varchar(30) default 'ROLE_MEMBER',
	created_date TIMESTAMP(0) default now(),
	modified_date TIMESTAMP(0) default now()
);
