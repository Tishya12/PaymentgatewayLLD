package Transaction;

import java.util.List;

public class TxnController {

    TxnService txnService = new TxnService();

    public void makePayment(TxnDO txn){
        txnService.makePayment(txn);
    }

    public List<TxnDO> getTxnHistory(int userId){
        return txnService.getTxnHistory(userId);
    }
}
