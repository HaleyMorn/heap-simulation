import javafx.concurrent.Service;
import javafx.concurrent.Task;
class exit extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
         	Thread.sleep(4000);
               //Thread.sleep(5000);
               return null;}};}}
               
class sixSec extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(5000);
               return null;}};}}               
               
class threeSec extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(3000);
               return null;}};}}
               
class twoSec extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(2000);
               return null;}};}}
               
              
               
class flipBack extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(3000);
               return null;}};}}
               
class oneSec extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(1000);
               return null;}};}} 
               	
class pointFiveSec extends Service<Void> {
	@Override
		protected Task<Void> createTask(){
		return new Task<Void>(){
	@Override
         protected Void call() throws Exception {
               Thread.sleep(500);
               return null;}};}}               	              