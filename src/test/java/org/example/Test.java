package org.example;

@RestController
public class Test {

    @autowired
    OrdersServiceImpl orderServiceImpl;

    @RequestMapping("/orders")
    public Flux<Order> getOrders(ServerWebExchange exchange, @RequestBody @Valid Order order) {

        return orderServiceImpl.getOrders(order);

    }

}

public class OrdersServiceImpl implements OrderService{

    @Override
    public Flux<Order> getOrders(){

        WebClient().builder().uri("/orders").build().retrive().bodyToFlux().onErrorResume(ResponseError:5xx, new CustomException("downstream service is not available"));
    }
}

pulbic interface OrderService{

    public Flux<Order> getOrders(Order order);
}

Flux.range(1,100).delay(1000).faltMap(obj -> {
        System.out.println(obj)
        )
                });

public class UserRepository implements ReactiveCurdRepository<User, Integer>{

    @Query("SELECT USER BETWEEN start = ? and end = ?")
    public Flux<User> findUsersUsingLimit(int start, int end);
}
