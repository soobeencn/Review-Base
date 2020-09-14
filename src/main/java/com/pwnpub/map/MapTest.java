package com.pwnpub.map;

import com.pwnpub.pojo.Transaction;
import com.pwnpub.pojo.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Giannis
 * @date 2020-08-25 23:33
 * @desc
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("test", "123");

        map.forEach((k, v) -> System.out.println(k + v));

        //java7
        List<Transaction> txsList = new ArrayList<>();
        Transaction transaction = new Transaction();
        transaction.setTime(String.valueOf(System.currentTimeMillis()));
        transaction.setTxHash("hashsdklfslf");
        transaction.setType("0");
        transaction.setValue(123);


        Transaction transactionExtend = new Transaction();
        transactionExtend.setType("1");
        transactionExtend.setTxHash("abc");
        transactionExtend.setType("1");
        transactionExtend.setValue(124);
        txsList.add(transaction);

        /*for (Transaction tx : txsList) {
            if (tx.getType().equals("0")) {
                txsList.add(tx);
            }
        }*/

        Collections.sort(txsList, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        /*List<Integer> transactionIds = new ArrayList<>();
        for(Transaction t : txsList) {
            transactionIds.add(t.getId());
        }
*/
        List<Integer> transactionIds = txsList.parallelStream()
                .filter(t -> t.getType() == "0")

                //.sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());

        List<String> list = Arrays.asList("userName", "aGe", "sex");
        list.stream().map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        String text = "这是一个文本";
        Optional.ofNullable(text).ifPresent(System.out::println);

        System.out.println();

        User user = new User();
        user.setId("1");
        user.setName("soobeencn");
        user.setAge(26);


        Optional.ofNullable(user)
                .map(u -> {
                    u.setName("divid");
                    u.setAge(30);
                    return u;
                });

        Optional.ofNullable(user)
                .filter(u -> "david".equals(user.getName()))
                .orElseGet(
                        () -> {
                            User userInfo = new User();
                            userInfo.setId("2");
                            return userInfo;
                        });
    }
}
