create table board (
	id serial not null,
	title varchar(100) not null,
	content text not null,
	writer varchar(20) not null,
	hits int not null,
	delete_yn char default 'N' not null,
	created_date TIMESTAMP not null,
	modified_date TIMESTAMP,
	primary key (id)
);

select * from board;

commit;

create type enum_board as enum('Y','N');