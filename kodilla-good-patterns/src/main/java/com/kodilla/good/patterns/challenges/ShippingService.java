package com.kodilla.good.patterns.challenges;

public class OrderShippingService {

    private PaymentInformation paymentInformation;
    private InformationService informationService;

    private DeliveryInformation deliveryInformation;

    public OrderShippingService(final PaymentInformation paymentInformation, final InformationService informationService, final DeliveryInformation deliveryInformation) {
        this.paymentInformation = paymentInformation;
        this.informationService = informationService;
        this.deliveryInformation = deliveryInformation;
    }


    public OrderToSend sendingProcess(final OrderDto orderDto) {

        boolean isPayed = paymentInformation.orderPaymentInformation(orderDto.getUser(), orderDto.getAccountNumber());

        if (isPayed) {
            informationService.information(orderDto.getUser());
            deliveryInformation.deliveryProduct(orderDto.getUser(), orderDto.getProduct());

            return new OrderToSend(orderDto, true);
        } else {
            return new OrderToSend(orderDto, false);
        }
    }
}
