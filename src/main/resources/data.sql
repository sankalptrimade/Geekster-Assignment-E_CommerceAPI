--Users Data
INSERT
INTO
  user_table
  (user_name, email, password, phone_number)
VALUES
  ('Sankalp Trimade', 'sankalp@gmail.com', 'sankalp', '7974897322'),
  ('Aditya Pahade', 'aditya@gmail.com', 'aditya', '9993347741'),
  ('Abhinav Shandilya', 'abhinav@gmail.com', 'abhinav', '9630650969'),
  ('Prathamesh Wate', 'prathamesh@gmail.com', 'prathamesh', '9827162969'),
  ('Ayush Jain', 'ayush@gmail.com', 'ayush', '8817818888');

--Products Data
  INSERT
INTO
  product_table
  (product_name, price, description, category, brand)
VALUES
  ('Lenovo Laptop', 50000, '12GB Ram, 1TB ROM', 'Electronic Device', 'Lenovo'),
  ('IPhone 14 pro max', 100000, '12GB Ram, 512GB ROM', 'Electronic Device', 'Apple'),
  ('Shirt', 500, 'Fabric:- 100% cotton', 'Cloths', 'Levis'),
  ('Wrist Watch', 5000, 'It makes it easy to see the time', 'Watch', 'Titan'),
  ('One plus 10R', 45000, '12GB Ram, 256GB ROM', 'Mobile Device', 'OnePlus');

--Address Data
INSERT
INTO
  address_table
  (address, landmark, phone_number, zipcode, state, user_id)
VALUES
  ('Shri Ram Nagar', 'V3-Dahrohar', '8899663355', '492007', 'Chhattisgarh', 1),
  ('New Shanti Nagar', 'Kesha Heights', '4477556699', '492001', 'Maharashtra', 1),
  ('Avanti Vihar', 'KT road', '7744112255', '887745', 'Tamil Nadu', 2),
  ('Telibandha', 'IP mall', '8899665522', '741258', 'Tamil Nadu', 3),
  ('Gol Chowk', 'USP Gate', '8877445599', '748965', 'Gujrat', 3),
  ('Kalibadi chowk', 'Grass Memorial', '4477889966', '236541', 'Kerala', 4),
  ('Vip road', 'Surya Talkies', '9966332255', '658974', 'Punjab', 5),
  ('Katora Talab', 'CP road', '7744112255', '874569', 'Jammu and Kashmir', 5);

--Orders Data
  INSERT
INTO
  order_table
  (user_id, product_id, address_id, product_quantity)
VALUES
  (1, 5, 1, 10),
  (2, 4, 2, 60),
  (3, 3, 1, 08),
  (4, 2, 2, 15),
  (5, 1, 3, 200),
  (5, 1, 4, 100),
  (4, 2, 3, 80),
  (3, 3, 4, 50),
  (2, 4, 5, 30),
  (1, 5, 5, 20);
