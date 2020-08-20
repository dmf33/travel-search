package com.hobo.trip.mapper;

import com.amadeus.resources.HotelOffer;
import com.hobo.trip.dto.hotel.HotelOfferDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    HotelOfferDto toHotelOfferFromAmadeus(HotelOffer hotelOffer);

    List<HotelOfferDto> toHotelOffersFromAmadeus(List<HotelOffer> hotelOffers);
}
