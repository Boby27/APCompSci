/**
 * CJ Zeiger
 * Vendor Class a part of SnackBar
 * Block 3B
 * March 11th, 2014
 */
package com.compsci.chapter9.SnackBar;
/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private static double _totalSales;
  private int _price;
  private int _stock;
  private int _deposit;
  private int _change;
  public Vendor(int cents, int stock) {
    _stock = stock;
    _price = cents;
  }
  public void setStock(int stock){
    _stock = stock;
  }

  public int getStock(){
    return _stock;
  }

  public void addMoney(int cents){
    if(_stock==0){
      return;
    }
    _deposit += cents;
  }
  public int getDeposit(){
    return _deposit;
  }
  public boolean makeSale(){
    if(_stock>0&&_deposit>=_price){
      _stock -= 1;
      _change = _deposit - _price;
      _deposit = 0;
      _totalSales += _price;
      return true;
    }
    return false;
  }
  public int getChange(){
    int change = _change;
    _change = 0;
    return change;
  }
  public static double getTotalSales(){
    return _totalSales/100;
  }
}
