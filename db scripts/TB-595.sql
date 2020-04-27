CREATE TABLE roles
(
  id bigint NOT NULL,
  role character varying(255),
  CONSTRAINT role_pkey PRIMARY KEY (id)
);



CREATE TABLE users
(
  id bigint NOT NULL,
  password character varying(255),
  username character varying(255),
  CONSTRAINT users_pkey PRIMARY KEY (id)
);


CREATE TABLE user_role
(
  user_id bigint NOT NULL,
  role_id bigint NOT NULL,
  CONSTRAINT user_role_pkey PRIMARY KEY (user_id, role_id),
  CONSTRAINT fka68196081fvovjhkek5m97n3y FOREIGN KEY (role_id)
      REFERENCES roles (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkj345gk1bovqvfame88rcx7yyx FOREIGN KEY (user_id)
      REFERENCES users (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

insert into roles values(1, 'ROLE_ADMIN');
insert into roles values(2, 'ROLE_USER');