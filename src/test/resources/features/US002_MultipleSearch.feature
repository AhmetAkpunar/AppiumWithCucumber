Feature: Multiple item search Test

  Scenario Outline: User search be able multiple items

    * User launches n11 mobile app
    * search "<arananKelime>"
    * adds to cart
    * verify that all product are in the cart

    Examples:
    | arananKelime |
    | battaniye    |
    | yorgan       |
    | nevresim     |