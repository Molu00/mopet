package tw.com.MoPet.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shipping")
public class shipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shippingid")
	private Integer shippingId;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "shippingId",cascade = CascadeType.ALL)
	private Set<order> orderShipping=new LinkedHashSet<order>();
	
	@Column(name="shippingway")
	private String shippingWay;
	
	@Column(name="shippingPrice")
	private Integer shippingPrice;

	
	public shipping() {
		// TODO Auto-generated constructor stub
	}


	public Integer getShippingId() {
		return shippingId;
	}


	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}


	public String getShippingWay() {
		return shippingWay;
	}


	public void setShippingWay(String shippingWay) {
		this.shippingWay = shippingWay;
	}


	public Integer getShippingPrice() {
		return shippingPrice;
	}


	public void setShippingPrice(Integer shippingPrice) {
		this.shippingPrice = shippingPrice;
	}


	public Set<order> getOrderShipping() {
		return orderShipping;
	}


	public void setOrderShipping(Set<order> orderShipping) {
		this.orderShipping = orderShipping;
	}



}
