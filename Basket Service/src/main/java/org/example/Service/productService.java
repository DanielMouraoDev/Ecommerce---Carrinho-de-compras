package Service;

import Client.Response.platziProductResponse;
import Client.platziStoreClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class productService {

    private final platziStoreClient platziStoreClient;

    public List<platziProductResponse> getAllProducts() {
        return platziStoreClient.getAllProducts();

    }

    public platziProductResponse getProductById(long id) {
        return platziStoreClient.getProductById(id);

    }
}
