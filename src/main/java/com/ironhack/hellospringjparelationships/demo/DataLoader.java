package com.ironhack.hellospringjparelationships.demo;


import com.ironhack.hellospringjparelationships.model.*;
import com.ironhack.hellospringjparelationships.repository.AssistantToTheRegionalManagerRepository;
import com.ironhack.hellospringjparelationships.repository.BranchRepository;
import com.ironhack.hellospringjparelationships.repository.PaperRepository;
import com.ironhack.hellospringjparelationships.repository.SalesOrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {


    private final PaperRepository paperRepository;
    private final SalesOrderRepository salesOrderRepository;
    private final BranchRepository branchRepository;
    private final AssistantToTheRegionalManagerRepository assistantToTheRegionalManagerRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Branch stamfordBranch = new Branch();
        stamfordBranch.setName("Dunder Mifflin Stamford");
        stamfordBranch.setLocation("Stamford, Connecticut");
        branchRepository.save(stamfordBranch);

        AssistantToTheRegionalManager dwight = new AssistantToTheRegionalManager();
        dwight.setName("Dwight Schrute");
        dwight.setBranch(stamfordBranch);
        assistantToTheRegionalManagerRepository.save(dwight);

        Paper copyPaper = new Paper();
        copyPaper.setName("Dunder Mifflin Copy Paper");
        copyPaper.setPaperType(PaperType.GLOSSY);
        paperRepository.save(copyPaper);

        Paper cardStock = new Paper();
        cardStock.setName("Schrute Farms Special");
        cardStock.setPaperType(PaperType.RECYCLED);
        paperRepository.save(cardStock);

        SalesOrder order = new SalesOrder();
        order.setClientName("Vance Refrigeration!");
        order.addPaper(copyPaper);
        order.addPaper(cardStock);
        order.setBranch(stamfordBranch);
        salesOrderRepository.save(order);

        SalesOrder order2 = new SalesOrder();
        order2.setClientName("Gabe Lewis Inc.");
        order2.addPaper(copyPaper);
        order2.setBranch(stamfordBranch);
        salesOrderRepository.save(order2);

    }
}
