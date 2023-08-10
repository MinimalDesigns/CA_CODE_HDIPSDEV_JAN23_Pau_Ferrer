// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prescriptions.proto

package server.services.prescriptionsService;

/**
 * <pre>
 * These are all the REQUEST and RESPONSE messages you need for all the public methods in the service
 * </pre>
 *
 * Protobuf type {@code prescriptionsService.CreateRequest}
 */
public  final class CreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:prescriptionsService.CreateRequest)
    CreateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRequest.newBuilder() to construct.
  private CreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRequest() {
    patientId_ = "";
    doctorId_ = "";
    expiryDate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            patientId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            doctorId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            expiryDate_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_CreateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_CreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            server.services.prescriptionsService.CreateRequest.class, server.services.prescriptionsService.CreateRequest.Builder.class);
  }

  public static final int PATIENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object patientId_;
  /**
   * <code>string patientId = 1;</code>
   */
  public java.lang.String getPatientId() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientId_ = s;
      return s;
    }
  }
  /**
   * <code>string patientId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPatientIdBytes() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCTORID_FIELD_NUMBER = 2;
  private volatile java.lang.Object doctorId_;
  /**
   * <code>string doctorId = 2;</code>
   */
  public java.lang.String getDoctorId() {
    java.lang.Object ref = doctorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      doctorId_ = s;
      return s;
    }
  }
  /**
   * <code>string doctorId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDoctorIdBytes() {
    java.lang.Object ref = doctorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      doctorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRYDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object expiryDate_;
  /**
   * <code>string expiryDate = 3;</code>
   */
  public java.lang.String getExpiryDate() {
    java.lang.Object ref = expiryDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expiryDate_ = s;
      return s;
    }
  }
  /**
   * <code>string expiryDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getExpiryDateBytes() {
    java.lang.Object ref = expiryDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expiryDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPatientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, patientId_);
    }
    if (!getDoctorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, doctorId_);
    }
    if (!getExpiryDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, expiryDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPatientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, patientId_);
    }
    if (!getDoctorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, doctorId_);
    }
    if (!getExpiryDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, expiryDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof server.services.prescriptionsService.CreateRequest)) {
      return super.equals(obj);
    }
    server.services.prescriptionsService.CreateRequest other = (server.services.prescriptionsService.CreateRequest) obj;

    boolean result = true;
    result = result && getPatientId()
        .equals(other.getPatientId());
    result = result && getDoctorId()
        .equals(other.getDoctorId());
    result = result && getExpiryDate()
        .equals(other.getExpiryDate());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getPatientId().hashCode();
    hash = (37 * hash) + DOCTORID_FIELD_NUMBER;
    hash = (53 * hash) + getDoctorId().hashCode();
    hash = (37 * hash) + EXPIRYDATE_FIELD_NUMBER;
    hash = (53 * hash) + getExpiryDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static server.services.prescriptionsService.CreateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.services.prescriptionsService.CreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.CreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(server.services.prescriptionsService.CreateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * These are all the REQUEST and RESPONSE messages you need for all the public methods in the service
   * </pre>
   *
   * Protobuf type {@code prescriptionsService.CreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:prescriptionsService.CreateRequest)
      server.services.prescriptionsService.CreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_CreateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_CreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server.services.prescriptionsService.CreateRequest.class, server.services.prescriptionsService.CreateRequest.Builder.class);
    }

    // Construct using server.services.prescriptionsService.CreateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      patientId_ = "";

      doctorId_ = "";

      expiryDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_CreateRequest_descriptor;
    }

    @java.lang.Override
    public server.services.prescriptionsService.CreateRequest getDefaultInstanceForType() {
      return server.services.prescriptionsService.CreateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public server.services.prescriptionsService.CreateRequest build() {
      server.services.prescriptionsService.CreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public server.services.prescriptionsService.CreateRequest buildPartial() {
      server.services.prescriptionsService.CreateRequest result = new server.services.prescriptionsService.CreateRequest(this);
      result.patientId_ = patientId_;
      result.doctorId_ = doctorId_;
      result.expiryDate_ = expiryDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof server.services.prescriptionsService.CreateRequest) {
        return mergeFrom((server.services.prescriptionsService.CreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(server.services.prescriptionsService.CreateRequest other) {
      if (other == server.services.prescriptionsService.CreateRequest.getDefaultInstance()) return this;
      if (!other.getPatientId().isEmpty()) {
        patientId_ = other.patientId_;
        onChanged();
      }
      if (!other.getDoctorId().isEmpty()) {
        doctorId_ = other.doctorId_;
        onChanged();
      }
      if (!other.getExpiryDate().isEmpty()) {
        expiryDate_ = other.expiryDate_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      server.services.prescriptionsService.CreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (server.services.prescriptionsService.CreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object patientId_ = "";
    /**
     * <code>string patientId = 1;</code>
     */
    public java.lang.String getPatientId() {
      java.lang.Object ref = patientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string patientId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPatientIdBytes() {
      java.lang.Object ref = patientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string patientId = 1;</code>
     */
    public Builder setPatientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string patientId = 1;</code>
     */
    public Builder clearPatientId() {
      
      patientId_ = getDefaultInstance().getPatientId();
      onChanged();
      return this;
    }
    /**
     * <code>string patientId = 1;</code>
     */
    public Builder setPatientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object doctorId_ = "";
    /**
     * <code>string doctorId = 2;</code>
     */
    public java.lang.String getDoctorId() {
      java.lang.Object ref = doctorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        doctorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string doctorId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDoctorIdBytes() {
      java.lang.Object ref = doctorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        doctorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string doctorId = 2;</code>
     */
    public Builder setDoctorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      doctorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string doctorId = 2;</code>
     */
    public Builder clearDoctorId() {
      
      doctorId_ = getDefaultInstance().getDoctorId();
      onChanged();
      return this;
    }
    /**
     * <code>string doctorId = 2;</code>
     */
    public Builder setDoctorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      doctorId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expiryDate_ = "";
    /**
     * <code>string expiryDate = 3;</code>
     */
    public java.lang.String getExpiryDate() {
      java.lang.Object ref = expiryDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expiryDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expiryDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getExpiryDateBytes() {
      java.lang.Object ref = expiryDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expiryDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expiryDate = 3;</code>
     */
    public Builder setExpiryDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expiryDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expiryDate = 3;</code>
     */
    public Builder clearExpiryDate() {
      
      expiryDate_ = getDefaultInstance().getExpiryDate();
      onChanged();
      return this;
    }
    /**
     * <code>string expiryDate = 3;</code>
     */
    public Builder setExpiryDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expiryDate_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:prescriptionsService.CreateRequest)
  }

  // @@protoc_insertion_point(class_scope:prescriptionsService.CreateRequest)
  private static final server.services.prescriptionsService.CreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new server.services.prescriptionsService.CreateRequest();
  }

  public static server.services.prescriptionsService.CreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRequest>() {
    @java.lang.Override
    public CreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public server.services.prescriptionsService.CreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

