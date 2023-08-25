import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, NativeModules, Button } from 'react-native';

const { TempModule }  = NativeModules;

console.log(TempModule);

export default function App() {

  const handle = () => {

     console.log(Temp.sayHello("Smit"));
  }
  return (
    <View style={styles.container}>
      <Button
      onPress={() => console.log(Temp.sayHello("Smit"))}
      title='Click Me'
      />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
