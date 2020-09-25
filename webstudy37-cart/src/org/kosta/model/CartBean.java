package org.kosta.model;

import java.util.ArrayList;

/**
 * 장바구니 객체
 * 장바구니에 관련한 비즈니스 로직을 처리한다
 * - 장바구니에 상품 추가
 * - 장바구니에 상품 추가시 중복을 확인한다.
 * - 장바구니에서 상품을 삭제한다.
 * - 장바구니에 담긴 상품 가격 총액
 * @author KOSTA
 *
 */
public class CartBean {
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	public ArrayList<ItemDTO> getItemList(){
		return itemList;
	}
	/**
	 * itemNo에 해당하는 상품아이템이 없으면 -1을 리턴하고
	 * 있으면 해당 상품 아이템 객체의 위치(인덱스)를 반환한다.
	 * @param itemNo
	 * @return
	 */
	public int findIndexByNo(String itemNo) {
		int index= -1;
		for(int i = 0; i < itemList.size(); i++) {
			if(itemList.get(i).getItemNo().contentEquals(itemNo)) {
				index = i;
				break;
			}
		}
		return index;
	}
	/**
	 * 장바구니에 상품을 추가한다.
	 * 상품이 중복되면 DuplicateItemException을 발생시키고 throws 한다
	 * @param dto
	 * @throws DuplicateItemException 
	 */
	public void addItem(ItemDTO dto) throws DuplicateItemException {
		if(findIndexByNo(dto.getItemNo()) != -1) {
			throw new DuplicateItemException();
		} else {
		itemList.add(dto);
		}
	}
	public void removeItem(String itemNo) {
		int index=findIndexByNo(itemNo);
		itemList.remove(index);
	}
	/**
	 *  장바구니에 담긴 상품아이템 총액을 반환한다.
	 *  장바구니 페이지에서 접근해 사용한다.
	 */
	public int getTotalPrice() {
		int total=0;
		for(int i =0; i<itemList.size(); i++) {
			total += itemList.get(i).getPrice();
		}
		return total;
	}
	@Override
	public String toString() {
		return "CartBean [itemList=" + itemList + "]";
	}
	
}
