package Transaction;

import instrument.InstrumentController;
import instrument.InstrumentDO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxnService {

    InstrumentController instrumentController = new InstrumentController();
    Map<Integer, List<Txn>> userTxnData = new HashMap<>();

    Processor processor = new Processor();
    public void makePayment(TxnDO txn){
        InstrumentDO senderInstrumentDO = instrumentController.getOneInstrumentByUserId(txn.getSenderUserId(), txn.getDebitInstrumentId() );
        InstrumentDO recieverInstrumentDO = instrumentController.getOneInstrumentByUserId(txn.getReceiverUserID(), txn.getCreditInstrumentId() );

        Txn txn = processor.processpayment(senderInstrumentDO, recieverInstrumentDO);
         // add txn in userTxnData corresponding to reciever and sender both;

    }

    public List<TxnDO> getTxnHistory(int userId){
        // return txn list for the user
    }
}
