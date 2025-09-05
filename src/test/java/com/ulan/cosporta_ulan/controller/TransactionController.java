package com.ulan.cosporta_ulan.controller;

import com.ulan.cosporta_ulan.model.Product;
import com.ulan.cosporta_ulan.model.Transaction;
import com.ulan.cosporta_ulan.repository.ProductRepository;
import com.ulan.cosporta_ulan.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/Transaksi")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Transaction createTransaction(@RequestParam String productName,
                                         @RequestParam Integer quantity,
                                         @RequestParam String paymentType){
        Product product = productRepository.findByName(productName)
                .orElseThrow(()-> new RuntimeException("Produk Tidak Ditemukan"));
        int total = product.getPrice() * quantity;
        Transaction trx = new Transaction(
                product.getId(),
                product.getName(),
                quantity,
                paymentType,
                total,
                LocalDateTime.now());
        return transactionRepository.save(trx);
    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        if (transactionRepository.existsById(id)) {
            transactionRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 sukses hapus
        } else {
            return ResponseEntity.notFound().build(); // 404 kalau id ga ketemu
        }
    }
}
