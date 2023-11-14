--  create table if not exists photoz (
--      id bigint identity primary key,
--      file_name varchar(255),
--      content_type varchar(255),
--      data binary
--  )

  create table if not exists photoz (
      id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
      file_name varchar(255),
      content_type varchar(255),
      data binary large object
  );