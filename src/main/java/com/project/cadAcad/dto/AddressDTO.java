package com.project.cadAcad.dto;

import com.project.cadAcad.entities.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private Long addressId;
    private String street;
    private String neighborhood;
    private String zipcode;

    public AddressDTO(Long addressId, String street, String neighborhood, String zipcode) {
        this.addressId = addressId;
        this.street = street;
        this.neighborhood = neighborhood;
        this.zipcode = zipcode;
    }

    public AddressDTO(Address entity) {
        addressId = entity.getAddressId();
        street = entity.getStreet();
        neighborhood = entity.getNeighborhood();
        zipcode = entity.getZipcode();
    }

    public AddressDTO (){

    }
}
