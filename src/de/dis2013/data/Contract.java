package de.dis2013.data;
import java.util.Set;

import de.dis2013.util.Helper;
/**
 * Created by nxirakia on 03.05.17.
 */
public class Contract {
    //contract info

    private int contractid= -1;
    private String contractdate;
    private String settelmentplace;
    private TenancyContract tenancyContract;
    private PurchaseContract purchaseContract;

    public PurchaseContract getPurchaseContract() {
        return purchaseContract;
    }

    public void setPurchaseContract(PurchaseContract purchaseContract) {
        this.purchaseContract = purchaseContract;
    }

    public TenancyContract getTenancyContract() {
        return tenancyContract;
    }

    public void setTenancyContract(TenancyContract tenancyContract) {
        this.tenancyContract = tenancyContract;
    }

    public int getContractid() {
        return contractid;
    }

    public void setContractid(int contractid) {
        this.contractid = contractid;
    }

    public String getSettelmentplace() {
        return settelmentplace;
    }

    public void setSettelmentplace(String settelmentplace) {
        this.settelmentplace = settelmentplace;
    }

    public String getContractdate(){return contractdate; }

    public void setContractdate(String date){

        this.contractdate = date;

    }

    public Contract(){}

    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((getContractdate() == null) ? 0 : getContractdate().hashCode());
        result = prime * result + ((getSettelmentplace() == null) ? 0 : getSettelmentplace().hashCode());

        return result;
    }


}


