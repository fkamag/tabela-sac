# Tabela SAC

A tabela SAC é uma alternativa à tabela Price. Ela também é utilizada para cálculo de prestações de empréstimos, como financiamentos imobiliários.

Ao contrário da tabela Price, ela não possui valor fixo de prestação. Ao invés disso ela possui valor fixo de amortização. Ou seja, amortiza-se o mesmo valor todo mês.

Logo no início do cálculo podemos dividir o saldo devedor pelo número total de meses para obter o valor da amortização.

Em cada mês, iremos aplicar a taxa de juros ao saldo devedor da mesma maneira que na tabela Price para descobrir quanto pagaremos de juros naquele mês. Em seguida, podemos somar taxa de juros e amortização (que é constante) para obter o valor da prestação. O novo saldo devedor é obtido subtraindo o valor amortizado, como na tabela Price.

Assim, temos que o cálculo dos valores para a tabela SAC são:

amortizacao = total_saldo_devedor / total_de_meses

juros_mensal = saldo_devedor_atual X juros_ao_mes

parcela_mensal = juros_mensal + amortizacao

saldo_devedor_atual = saldo_devedor_atual - amortizacao


Faça um programa que pergunta:

- o valor de um empréstimo

- a taxa de juros do empréstimo
- o tempo para pagamento

Seu programa deverá mostrar o valor fixo da Amortização e mês a mês, o valor pago de juros, o valor da prestação e o saldo devedor atualizado. Ao final mostrar quanto foi o total pago nas prestações, o total amortizado e o total pago em juros. Exemplo:

Exemplo: para 30000.00 reais em 12 meses com juros de 1.5%:

Valor fixo da amortização R$ 2500,00, Saldo devedor total R$ 30000,00 com um juros de 1.5% ao mês
Parcela 1 | Juros: R$ 450,00 | Prestação: R$ 2950,00 | Saldo devedor: R$ 27500,00
Parcela 2 | Juros: R$ 412,50 | Prestação: R$ 2912,50 | Saldo devedor: R$ 25000,00
Parcela 3 | Juros: R$ 375,00 | Prestação: R$ 2875,00 | Saldo devedor: R$ 22500,00
Parcela 4 | Juros: R$ 337,50 | Prestação: R$ 2837,50 | Saldo devedor: R$ 20000,00
Parcela 5 | Juros: R$ 300,00 | Prestação: R$ 2800,00 | Saldo devedor: R$ 17500,00
Parcela 6 | Juros: R$ 262,50 | Prestação: R$ 2762,50 | Saldo devedor: R$ 15000,00
Parcela 7 | Juros: R$ 225,00 | Prestação: R$ 2725,00 | Saldo devedor: R$ 12500,00
Parcela 8 | Juros: R$ 187,50 | Prestação: R$ 2687,50 | Saldo devedor: R$ 10000,00
Parcela 9 | Juros: R$ 150,00 | Prestação: R$ 2650,00 | Saldo devedor: R$ 7500,00
Parcela 10 | Juros: R$ 112,50 | Prestação: R$ 2612,50 | Saldo devedor: R$ 5000,00
Parcela 11 | Juros: R$ 75,00 | Prestação: R$ 2575,00 | Saldo devedor: R$ 2500,00
Parcela 12 | Juros: R$ 37,50 | Prestação: R$ 2537,50 | Saldo devedor: R$ 0,00
Total: Prestação R$ 32925,00, Juros R$ 2925,00, Amortização R$ 30000,00