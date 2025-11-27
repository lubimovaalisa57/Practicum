#include <iostream>
using namespace std;

int main() 
{
    int size;
    cout << "Сколько чисел в списке? ";
    cin >> size;
    
    int numbers[size];
    
    cout << "Введите " << size << " чисел: ";
    for (int i = 0; i < size; i++) {
        cin >> numbers[i];
    }
    
    int min = numbers[0];
    for (int i = 1; i < size; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    
    cout << "Минимум: " << min << endl;
    
    return 0;
}