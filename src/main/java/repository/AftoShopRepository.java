package repository;

import org.example.repository.AftoShop;

import java.util.List;

public interface AftoShopRepository {
    String saveAftoShop(AftoShop aftoShop);
    List<AftoShop> getalldataviaid(Long id);
    List<AftoShop> getAllAftoShop();
    String updateAftoShop(Long id,AftoShop aftoShop);
    void deleteAftoShopById(Long id);
}
