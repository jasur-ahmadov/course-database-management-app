package az.orient.course.service.impl;

import az.orient.course.dao.PaymentDao;
import az.orient.course.model.Payment;
import az.orient.course.service.PaymentService;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    private PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public List<Payment> getPaymentList() throws Exception {
        return paymentDao.getPaymentList();
    }

    @Override
    public void addPayment(Payment payment) throws Exception {
        paymentDao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long paymentId) throws Exception {
        return paymentDao.getPaymentById(paymentId);
    }

    @Override
    public void updatePayment(Payment payment) throws Exception {
        paymentDao.updatePayment(payment);
    }

    @Override
    public void deletePayment(Long paymentId) throws Exception {
        paymentDao.deletePayment(paymentId);
    }
}