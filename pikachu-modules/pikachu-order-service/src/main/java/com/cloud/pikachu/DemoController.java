package com.cloud.pikachu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {
    @Value("${env}")
    private String env ;

    @GetMapping("/print")
    @ResponseBody
    public String print(HttpServletRequest request){
//        String[] atp = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka",
//                "David Ferrer","Roger Federer",
//                "Andy Murray","Tomas Berdych",
//                "Juan Martin Del Potro"};
//        List<String> players =  Arrays.asList(atp);
//        players.forEach((player) -> System.out.print(player + "; "));
//        players.forEach(System.out::println);
//        Runnable race2 = () -> System.out.println("Hello world !");
        return env ;
    }

}
