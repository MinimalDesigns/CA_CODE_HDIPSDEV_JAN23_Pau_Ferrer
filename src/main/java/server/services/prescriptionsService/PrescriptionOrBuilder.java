// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prescriptions.proto

package server.services.prescriptionsService;

public interface PrescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:prescriptionsService.Prescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string patientId = 2;</code>
   */
  java.lang.String getPatientId();
  /**
   * <code>string patientId = 2;</code>
   */
  com.google.protobuf.ByteString
      getPatientIdBytes();

  /**
   * <code>string doctorId = 3;</code>
   */
  java.lang.String getDoctorId();
  /**
   * <code>string doctorId = 3;</code>
   */
  com.google.protobuf.ByteString
      getDoctorIdBytes();

  /**
   * <code>string expiryDate = 4;</code>
   */
  java.lang.String getExpiryDate();
  /**
   * <code>string expiryDate = 4;</code>
   */
  com.google.protobuf.ByteString
      getExpiryDateBytes();
}
