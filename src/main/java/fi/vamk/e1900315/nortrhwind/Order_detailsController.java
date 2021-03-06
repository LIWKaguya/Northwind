package fi.vamk.e1900315.nortrhwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order_detailsController {
    @Autowired
    private Order_detailsRepository Order_detailsRepo;
    @GetMapping("/order_details/")
    private Iterable<Order_details> getOrder_details() {
        return Order_detailsRepo.findAll();
    }
    @GetMapping("/order_details/{id}/")
    private Order_details getOrder_detailsById(@PathVariable("id") Integer id) {
        return Order_detailsRepo.findById(id).get();
    }
    @PostMapping("/order_details/")
    private Order_details addOrder_details(@RequestBody Order_details newOrder_details) {
        return Order_detailsRepo.save(newOrder_details);
    }
    @DeleteMapping("/order_details/{id}/")
    private void deleteOrder_details(@PathVariable("id") Integer id) {
        Order_detailsRepo.deleteById(id);
    }
    @PutMapping("/order_details/")
    private Order_details updateOrder_details(@RequestBody Order_details newOrder_details) {
        return Order_detailsRepo.save(newOrder_details);
    }
}