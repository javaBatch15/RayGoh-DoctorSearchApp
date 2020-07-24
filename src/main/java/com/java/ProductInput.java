package com.java;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductInput implements Serializable {

    @NotEmpty(message = "Please provide a name")
    @Size(min = 3, max = 250, message = "Product name should be minimum 2 character and maximum 250 character")
    private String name;

    @NotEmpty(message = "Please provide a product description")
    @Size(min = 5, max = 50, message = "Product description should be minimum 2 character and maximum 5000 character")
    private String details;

    @Min(value = 0, message = "Price should not be negative")
    private float price;

    @Size(min = 1, max = 10, message = "Product should have minimum 1 image and maximum 10 images")
    private Set<MultipartFile> files;

    public Set<MultipartFile> getFiles() {
        return files;
    }
}
