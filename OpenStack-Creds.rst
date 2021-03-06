1. Keystone 
========

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |    OpenStack Compute Service     |
+-------------+----------------------------------+
|      id     | ddd30c0d7d7c4340b5f0b35d73f7183e |
+-------------+----------------------------------+
|     name    |               nova               |
+-------------+----------------------------------+
|     type    |             compute              |
+-------------+----------------------------------+
    
+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |     OpenStack Volume Service     |
+-------------+----------------------------------+
|      id     | ad9507938b5048bb9800f2528f448974 |
+-------------+----------------------------------+
|     name    |              cinder              |
+-------------+----------------------------------+
|     type    |              volume              |
+-------------+----------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |     OpenStack Image Service      |
+-------------+----------------------------------+
|      id     | 780631dd899b42ecbcdbc0774b851636 |
+-------------+----------------------------------+
|     name    |              glance              |
+-------------+----------------------------------+
|     type    |              image               |
+-------------+----------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |        OpenStack Identity        |
+-------------+----------------------------------+
|      id     | 8d5b41a73e9c4488a1652908e398c281 |
+-------------+----------------------------------+
|     name    |             keystone             |
+-------------+----------------------------------+
|     type    |             identity             |
+-------------+----------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |      OpenStack EC2 service       |
+-------------+----------------------------------+
|      id     | e48d847e0e824a0f9be5dbfa8d65e32b |
+-------------+----------------------------------+
|     name    |               ec2                |
+-------------+----------------------------------+
|     type    |               ec2                |
+-------------+----------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
| description |   OpenStack Networking service   |
+-------------+----------------------------------+
|      id     | 31a9e97e6d0444d9ab6ad33982c17ab9 |
+-------------+----------------------------------+
|     name    |             quantum              |
+-------------+----------------------------------+
|     type    |             network              |
+-------------+----------------------------------+

+-------------+---------------------------------------------+
|   Property  |                    Value                    |
+=============+=============================================+
|   adminurl  |  http://100.10.10.51:8774/v2/$(tenant_id)s  |
+-------------+---------------------------------------------+
|      id     |       ec1b217047ed44f0a7b55990c0234d44      |
+-------------+---------------------------------------------+
| internalurl |  http://100.10.10.51:8774/v2/$(tenant_id)s  |
+-------------+---------------------------------------------+
|  publicurl  | http://192.168.100.51:8774/v2/$(tenant_id)s |
+-------------+---------------------------------------------+
|    region   |                  RegionOne                  |
+-------------+---------------------------------------------+
|  service_id |       ddd30c0d7d7c4340b5f0b35d73f7183e      |
+-------------+---------------------------------------------+

+-------------+---------------------------------------------+
|   Property  |                    Value                    |
+=============+=============================================+
|   adminurl  |  http://100.10.10.51:8776/v1/$(tenant_id)s  |
+-------------+---------------------------------------------+
|      id     |       66378898bd2145d8937d3f23081c5fd4      |
+-------------+---------------------------------------------+
| internalurl |  http://100.10.10.51:8776/v1/$(tenant_id)s  |
+-------------+---------------------------------------------+
|  publicurl  | http://192.168.100.51:8776/v1/$(tenant_id)s |
+-------------+---------------------------------------------+
|    region   |                  RegionOne                  |
+-------------+---------------------------------------------+
|  service_id |       ad9507938b5048bb9800f2528f448974      |
+-------------+---------------------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
|   adminurl  |   http://100.10.10.51:9292/v2    |
+-------------+----------------------------------+
|      id     | a077ceb3f7de4f52aca91f78c768026c |
+-------------+----------------------------------+
| internalurl |   http://100.10.10.51:9292/v2    |
+-------------+----------------------------------+
|  publicurl  |  http://192.168.100.51:9292/v2   |
+-------------+----------------------------------+
|    region   |            RegionOne             |
+-------------+----------------------------------+
|  service_id | 780631dd899b42ecbcdbc0774b851636 |
+-------------+----------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
|   adminurl  |  http://100.10.10.51:35357/v2.0  |
+-------------+----------------------------------+
|      id     | 65c1c1538b654ee7af3560429dcc1425 |
+-------------+----------------------------------+
| internalurl |  http://100.10.10.51:5000/v2.0   |
+-------------+----------------------------------+
|  publicurl  | http://192.168.100.51:5000/v2.0  |
+-------------+----------------------------------+
|    region   |            RegionOne             |
+-------------+----------------------------------+
|  service_id | 8d5b41a73e9c4488a1652908e398c281 |
+-------------+----------------------------------+

+-------------+-------------------------------------------+
|   Property  |                   Value                   |
+=============+===========================================+
|   adminurl  |  http://100.10.10.51:8773/services/Admin  |
+-------------+-------------------------------------------+
|      id     |      50182dc09d9140e0bbd47efd6da63ded     |
+-------------+-------------------------------------------+
| internalurl |  http://100.10.10.51:8773/services/Cloud  |
+-------------+-------------------------------------------+
|  publicurl  | http://192.168.100.51:8773/services/Cloud |
+-------------+-------------------------------------------+
|    region   |                 RegionOne                 |
+-------------+-------------------------------------------+
|  service_id |      e48d847e0e824a0f9be5dbfa8d65e32b     |
+-------------+-------------------------------------------+

+-------------+----------------------------------+
|   Property  |              Value               |
+=============+==================================+
|   adminurl  |    http://100.10.10.51:9696/     |
+-------------+----------------------------------+
|      id     | 07a218efaa454036a704a6e2c9479faf |
+-------------+----------------------------------+
| internalurl |    http://100.10.10.51:9696/     |
+-------------+----------------------------------+
|  publicurl  |   http://192.168.100.51:9696/    |
+-------------+----------------------------------+
|    region   |            RegionOne             |
+-------------+----------------------------------+
|  service_id | 31a9e97e6d0444d9ab6ad33982c17ab9 |
+-------------+----------------------------------+


2. Glance
=====

1.Create and Regester Image in Glance - Image name: Cloud-Rack-TestImage
-------------

+------------------+--------------------------------------+
| Property         | Value                                |
+==================+======================================+
| checksum         | 50bdc35edb03a38d91b1b071afb20a3c     |
+------------------+--------------------------------------+
| container_format | bare                                 |
+------------------+--------------------------------------+
| created_at       | 2013-02-14T12:59:43                  |
+------------------+--------------------------------------+
| deleted          | False                                |
+------------------+--------------------------------------+
| deleted_at       | None                                 |
+------------------+--------------------------------------+
| disk_format      | qcow2                                |
+------------------+--------------------------------------+
| id               | 2c33c63a-036a-4ccb-a78c-4816259d7396 |
+------------------+--------------------------------------+
| is_public        | True                                 |
+------------------+--------------------------------------+
| min_disk         | 0                                    |
+------------------+--------------------------------------+
| min_ram          | 0                                    |
+------------------+--------------------------------------+
| name             | Cloud-Rack-TestImage                 |
+------------------+--------------------------------------+
| owner            | be08b13365da44cf99693266f19034a6     |
+------------------+--------------------------------------+
| protected        | False                                |
+------------------+--------------------------------------+
| size             | 9761280                              |
+------------------+--------------------------------------+
| status           | active                               |
+------------------+--------------------------------------+
| updated_at       | 2013-02-14T12:59:43                  |
+------------------+--------------------------------------+

2.Verify Image Registry Status In Glance
-------------
+--------------------------------------+-------------------------------+-------------+------------------+-----------+--------+
| ID                                   | Name                          | Disk Format | Container Format | Size      | Status |
+======================================+===============================+=============+==================+===========+========+
| 212ef8b4-70f4-4e8f-9bfe-4085358a3b89 | Cloud-Rack-PaaS-Precise       | qcow2       | bare             | 250871808 | active |
+--------------------------------------+-------------------------------+-------------+------------------+-----------+--------+
| 2f898724-37a0-4d37-b85e-108ac779b5f3 | Cloud-Rack-PaaS-Precise-32Bit | qcow2       | bare             | 538730496 | active |
+--------------------------------------+-------------------------------+-------------+------------------+-----------+--------+
| 66d0a914-d64e-4765-ac90-3df60e0f8484 | Cloud-Rack-Test-Cirros        | qcow2       | bare             | 9761280   | active |
+--------------------------------------+-------------------------------+-------------+------------------+-----------+--------+
| 6890a9e3-5f6b-46e6-9f65-c40336fd2cda | Cloud-Rack-Test-Cirros        | qcow2       | bare             | 9761280   | active |
+--------------------------------------+-------------------------------+-------------+------------------+-----------+--------+

+--------------------------------------+----------------------+-------------+------------------+---------+--------+

3. Create New Project and List all Members
----------

* Projects List
+----------------------------------+------------+---------+
|                id                |    name    | enabled |
+==================================+============+=========+
| 72591393c9ec4ae997c6b929ab357a32 |  service   |   True  |
+----------------------------------+------------+---------+
| be08b13365da44cf99693266f19034a6 |   admin    |   True  |
+----------------------------------+------------+---------+
| d9f96f3940ce464491e211cd2aad52b9 | Cloud-Rack |   True  |
+----------------------------------+------------+---------+

* User List
+----------------------------------+-----------------+---------+----------------------+
|                id                |       name      | enabled |        email         |
+==================================+=================+=========+======================+
| 105470891b1b43dfafefc7549490afe7 |     quantum     |   True  |  quantum@domain.com  |
+----------------------------------+-----------------+---------+----------------------+
| 57527cf9288a4b9f8d71c48f2c7f4226 |      glance     |   True  |  glance@domain.com   |
+----------------------------------+-----------------+---------+----------------------+
| 790fe5038d5e4d31888f167b9f19d0a4 |      Pranav     |   True  | pps.pranav@gmail.com |
+----------------------------------+-----------------+---------+----------------------+
| b3ea15ff4129467eae99e27599095473 |       nova      |   True  |   nova@domain.com    |
+----------------------------------+-----------------+---------+----------------------+
| b870fe9127ba4e99a9d08c6e552a5c5c |      admin      |   True  |   admin@domain.com   |
+----------------------------------+-----------------+---------+----------------------+
| d8b3bc1bd1c74a6e8d9f53157fc3bfa1 |      cinder     |   True  |  cinder@domain.com   |
+----------------------------------+-----------------+---------+----------------------+
| f1f250cda5524f40a1a1c4403797a48e | cloud-rack-user |   True  |    cloud@rack.com    |
+----------------------------------+-----------------+---------+----------------------+

4. Regester Cloud Images in Glance
--------------

* Ubuntu Server - Precise amd64 cloud image 

+------------------+--------------------------------------+
| Property         | Value                                |
+==================+======================================+
| checksum         | b81e565cd5a57af6519ac64262146c2b     |
+------------------+--------------------------------------+
| container_format | bare                                 |
+------------------+--------------------------------------+
| created_at       | 2013-02-19T14:04:51.687496           |
+------------------+--------------------------------------+
| deleted          | False                                |
+------------------+--------------------------------------+
| deleted_at       | None                                 |
+------------------+--------------------------------------+
| disk_format      | qcow2                                |
+------------------+--------------------------------------+
| id               | 212ef8b4-70f4-4e8f-9bfe-4085358a3b89 |
+------------------+--------------------------------------+
| is_public        | True                                 |
+------------------+--------------------------------------+
| min_disk         | 0                                    |
+------------------+--------------------------------------+
| min_ram          | 0                                    |
+------------------+--------------------------------------+
| name             | Cloud-Rack-PaaS-Precise              |
+------------------+--------------------------------------+
| owner            | None                                 |
+------------------+--------------------------------------+
| protected        | False                                |
+------------------+--------------------------------------+
| size             | 250871808                            |
+------------------+--------------------------------------+
| status           | active                               |
+------------------+--------------------------------------+
| updated_at       | 2013-02-19T14:04:54.755441           |
+------------------+--------------------------------------+


* Ubuntu Server Precise 32 bit - Raw qcow *.qcow - not cloud image!

+------------------+--------------------------------------+
| Property         | Value                                |
+==================+======================================+
| checksum         | d2debf7b89eab485c6f0874216fbd232     |
+------------------+--------------------------------------+
| container_format | bare                                 |
+------------------+--------------------------------------+
| created_at       | 2013-02-19T14:06:50.642347           |
+------------------+--------------------------------------+
| deleted          | False                                |
+------------------+--------------------------------------+
| deleted_at       | None                                 |
+------------------+--------------------------------------+
| disk_format      | qcow2                                |
+------------------+--------------------------------------+
| id               | 2f898724-37a0-4d37-b85e-108ac779b5f3 |
+------------------+--------------------------------------+
| is_public        | True                                 |
+------------------+--------------------------------------+
| min_disk         | 0                                    |
+------------------+--------------------------------------+
| min_ram          | 0                                    |
+------------------+--------------------------------------+
| name             | Cloud-Rack-PaaS-Precise-32Bit        |
+------------------+--------------------------------------+
| owner            | None                                 |
+------------------+--------------------------------------+
| protected        | False                                |
+------------------+--------------------------------------+
| size             | 538730496                            |
+------------------+--------------------------------------+
| status           | active                               |
+------------------+--------------------------------------+
| updated_at       | 2013-02-19T14:07:05.115691           |
+------------------+--------------------------------------+

* Ubuntu Server -  Precise ix86 - cloud image

+------------------+--------------------------------------+
| Property         | Value                                |
+==================+======================================+
| checksum         | d096b8f45f884ea67e1a3624bee63f2d     |
+------------------+--------------------------------------+
| container_format | bare                                 |
+------------------+--------------------------------------+
| created_at       | 2013-02-24T08:44:38.844824           |
+------------------+--------------------------------------+
| deleted          | False                                |
+------------------+--------------------------------------+
| deleted_at       | None                                 |
+------------------+--------------------------------------+
| disk_format      | qcow2                                |
+------------------+--------------------------------------+
| id               | 00a17e35-4058-4615-ac44-dce520bfe527 |
+------------------+--------------------------------------+
| is_public        | True                                 |
+------------------+--------------------------------------+
| min_disk         | 0                                    |
+------------------+--------------------------------------+
| min_ram          | 0                                    |
+------------------+--------------------------------------+
| name             | precise-server-cloud-image-x86       |
+------------------+--------------------------------------+
| owner            | None                                 |
+------------------+--------------------------------------+
| protected        | False                                |
+------------------+--------------------------------------+
| size             | 229834752                            |
+------------------+--------------------------------------+
| status           | active                               |
+------------------+--------------------------------------+
| updated_at       | 2013-02-24T08:44:42.996879           |
+------------------+--------------------------------------+


* Ubuntu Server - Quantal Server ix86 - cloud image

+------------------+--------------------------------------+
| Property         | Value                                |
+==================+======================================+
| checksum         | 33f766210b435a7d5618217e4fd95d31     |
+------------------+--------------------------------------+
| container_format | bare                                 |
+------------------+--------------------------------------+
| created_at       | 2013-02-24T08:45:13.405988           |
+------------------+--------------------------------------+
| deleted          | False                                |
+------------------+--------------------------------------+
| deleted_at       | None                                 |
+------------------+--------------------------------------+
| disk_format      | qcow2                                |
+------------------+--------------------------------------+
| id               | 533d0943-e138-40c1-bac9-1c93b428aaec |
+------------------+--------------------------------------+
| is_public        | True                                 |
+------------------+--------------------------------------+
| min_disk         | 0                                    |
+------------------+--------------------------------------+
| min_ram          | 0                                    |
+------------------+--------------------------------------+
| name             | quantal-server-cloud-image-x86       |
+------------------+--------------------------------------+
| owner            | None                                 |
+------------------+--------------------------------------+
| protected        | False                                |
+------------------+--------------------------------------+
| size             | 220594176                            |
+------------------+--------------------------------------+
| status           | active                               |
+------------------+--------------------------------------+
| updated_at       | 2013-02-24T08:45:18.429352           |
+------------------+--------------------------------------+
