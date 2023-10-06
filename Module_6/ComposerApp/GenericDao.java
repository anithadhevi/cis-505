/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Cyberactive., Instruction to Assignment 6.2.,
   https://learn-us-east-1-prod-fleet01-xythos.content.blackboardcdn.com/blackboard.learn.xythos.prod/5a31d48b683a8/20827415?X-Blackboard-S3-Bucket=blackboard.learn.xythos.prod&X-Blackboard-Expiration=1696518000000&X-Blackboard-Signature=q%2BKvjI2qp8QCwf8%2BBkxbtug3uVQyTenImmtJki1axA4%3D&X-Blackboard-Client-Id=100225&X-Blackboard-S3-Region=us-east-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27Instructions%2520for%2520Assignment%25206.2.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEFIaCXVzLWVhc3QtMSJIMEYCIQDJsN%2BpRpb36bvz%2B7RHXhYCwQ5gvmBhxwh0Xp8%2B9nwAiAIhAJ2F1LscctB8lXDRgXmV9l532Cokw%2B9wVP%2FMQlT3c1ZgKrQFCFoQABoMNTU2OTAzODYxMzYxIgxRt5xZFDWoP9%2BvpiMqkQW3%2F0d%2FkhrKm3ZAdy8Ehu1D1DIDcH%2BtjGRfe5q%2BDBeb6GgytEAugcvH%2FX5Ty0qpoCQvELyXd9Bp0gjbLSWQfBmG3pBn54f0Y1TLJwlH5zgT5T0IBn2TTC7pkLGZwZ31SmFA8IYu0%2BN4SaXybNJO0w%2F2p7T7hDMqda4IbJ0Cg76SQqcfVe7sffoRTqlBK4Z6jg48TuDGRzddvl1o5k%2FfvuCVc7M%2FQPrVZfqRmBumtD5XU8Xzm2CO9V0p9fzvDmxBVcFKRFF1CI48%2BN66d0wV%2FI%2F%2FV6gOdpYbXiIE9v9Qqi%2BefHtXWE33Z2QxDsHFhxqUF%2FFZLlMHZ7zk%2B38s5cRoajP7BlYymamiSBphHomSMe%2F%2BDOZ9Ra0n%2BUEJF37KPhGvLbtEf7Gsa9rpEZsqDe6C3Bv3c3dUNBB76b5BroGbpPctEXd7TdsMfyn5bTGSKNKHyweIIXcTMAgQq5xkEfdHzsAMutFUz6WDjiFigMdDZP9OsqVP8kDqpq2CsbUX%2BiGxrX1TdZgcVn3EI1A430bvf0b0y%2FopkL8jKq9BTl4Gv6jSJ0kVxMxKZFdCcP0Ny3sCp%2FmEBHakTgnxLuYrQxVR8%2FtuIVK0E%2F%2BRSKVnf7nVudc%2Fn8vh250s9%2BHQwvuMnrPkqZsbZnO6lK9fYXUBLNsW3L3KROhKhskEdtQVrqKCRKfbaNQ8rvupJhShVNqoU2FK%2B%2Fx8oyScyoX64QNRcjG5EhYCL6olm1xFcxVlZ2pNTYTNIGtc4b4w01pIKdNUcXEPgn6TBLpZG1KxmF1VUP%2FDyagLUlTMjTzMtrWm%2FDTRw38ST5OwWLCdOgbirXLtinf0Vt6kw7jDlGzT16brok0FiKD3DNh52Fk%2FRIxnGyQTXpmUAHAw2vz5qAY6sAGg1lLpylMOWq91R%2BbqcrowdOxYa3bBrYy2DEsUsqqnmHFoL4HBnf8t0xRrD%2BXOS00BmB79IRWcJvQqOwTQyPuWKxOlGNDnwD3ZYjrT9D25mZvKz522znnCTLeK5GRv%2BDsvAkvAcgP4ChPhfsrUPqx8yKWGu%2BbxK5%2BVsL7twhHTw8Yi3YELpOmKCXnnpw9I2ZUV1jRqTw09nAlWTn4F2DvMLI76IuUo28a1g5Z4It%2F0Sg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20231005T090000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAYDKQORRY27OZWCNS%2F20231005%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=b3a320b5612832e72499d3ab87bb1264221382141299ad2e1b7a0a1c51a15565
    Java tutorials.,https://www.w3schools.com/java/ */
package Module_6.ComposerApp;

import java.util.List;

public interface GenericDao <E, K>
{
 //void create (E entity);
 //E getById(long id);
 List<E> findAll();
 //void update(E entity);
 //void delete(long id);
 E findBy(K key);
 void insert (E entity);
}
