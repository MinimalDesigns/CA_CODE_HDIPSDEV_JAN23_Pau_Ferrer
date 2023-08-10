// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prescriptions.proto

package server.services.prescriptionsService;

/**
 * Protobuf type {@code prescriptionsService.Drug}
 */
public  final class Drug extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:prescriptionsService.Drug)
    DrugOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Drug.newBuilder() to construct.
  private Drug(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Drug() {
    id_ = "";
    prescriptionsId_ = "";
    drug_ = "";
    doses_ = "";
    comment_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Drug(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            prescriptionsId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            drug_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            doses_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            comment_ = s;
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
    return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_Drug_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_Drug_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            server.services.prescriptionsService.Drug.class, server.services.prescriptionsService.Drug.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRESCRIPTIONSID_FIELD_NUMBER = 2;
  private volatile java.lang.Object prescriptionsId_;
  /**
   * <code>string prescriptionsId = 2;</code>
   */
  public java.lang.String getPrescriptionsId() {
    java.lang.Object ref = prescriptionsId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prescriptionsId_ = s;
      return s;
    }
  }
  /**
   * <code>string prescriptionsId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPrescriptionsIdBytes() {
    java.lang.Object ref = prescriptionsId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prescriptionsId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DRUG_FIELD_NUMBER = 3;
  private volatile java.lang.Object drug_;
  /**
   * <code>string drug = 3;</code>
   */
  public java.lang.String getDrug() {
    java.lang.Object ref = drug_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      drug_ = s;
      return s;
    }
  }
  /**
   * <code>string drug = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDrugBytes() {
    java.lang.Object ref = drug_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      drug_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOSES_FIELD_NUMBER = 4;
  private volatile java.lang.Object doses_;
  /**
   * <code>string doses = 4;</code>
   */
  public java.lang.String getDoses() {
    java.lang.Object ref = doses_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      doses_ = s;
      return s;
    }
  }
  /**
   * <code>string doses = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDosesBytes() {
    java.lang.Object ref = doses_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      doses_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENT_FIELD_NUMBER = 5;
  private volatile java.lang.Object comment_;
  /**
   * <code>string comment = 5;</code>
   */
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   * <code>string comment = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comment_ = b;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getPrescriptionsIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prescriptionsId_);
    }
    if (!getDrugBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, drug_);
    }
    if (!getDosesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, doses_);
    }
    if (!getCommentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, comment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getPrescriptionsIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prescriptionsId_);
    }
    if (!getDrugBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, drug_);
    }
    if (!getDosesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, doses_);
    }
    if (!getCommentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, comment_);
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
    if (!(obj instanceof server.services.prescriptionsService.Drug)) {
      return super.equals(obj);
    }
    server.services.prescriptionsService.Drug other = (server.services.prescriptionsService.Drug) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getPrescriptionsId()
        .equals(other.getPrescriptionsId());
    result = result && getDrug()
        .equals(other.getDrug());
    result = result && getDoses()
        .equals(other.getDoses());
    result = result && getComment()
        .equals(other.getComment());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PRESCRIPTIONSID_FIELD_NUMBER;
    hash = (53 * hash) + getPrescriptionsId().hashCode();
    hash = (37 * hash) + DRUG_FIELD_NUMBER;
    hash = (53 * hash) + getDrug().hashCode();
    hash = (37 * hash) + DOSES_FIELD_NUMBER;
    hash = (53 * hash) + getDoses().hashCode();
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static server.services.prescriptionsService.Drug parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.Drug parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.services.prescriptionsService.Drug parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.services.prescriptionsService.Drug parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.Drug parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.services.prescriptionsService.Drug parseFrom(
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
  public static Builder newBuilder(server.services.prescriptionsService.Drug prototype) {
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
   * Protobuf type {@code prescriptionsService.Drug}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:prescriptionsService.Drug)
      server.services.prescriptionsService.DrugOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_Drug_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_Drug_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server.services.prescriptionsService.Drug.class, server.services.prescriptionsService.Drug.Builder.class);
    }

    // Construct using server.services.prescriptionsService.Drug.newBuilder()
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
      id_ = "";

      prescriptionsId_ = "";

      drug_ = "";

      doses_ = "";

      comment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return server.services.prescriptionsService.PrescriptionsServiceImpl.internal_static_prescriptionsService_Drug_descriptor;
    }

    @java.lang.Override
    public server.services.prescriptionsService.Drug getDefaultInstanceForType() {
      return server.services.prescriptionsService.Drug.getDefaultInstance();
    }

    @java.lang.Override
    public server.services.prescriptionsService.Drug build() {
      server.services.prescriptionsService.Drug result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public server.services.prescriptionsService.Drug buildPartial() {
      server.services.prescriptionsService.Drug result = new server.services.prescriptionsService.Drug(this);
      result.id_ = id_;
      result.prescriptionsId_ = prescriptionsId_;
      result.drug_ = drug_;
      result.doses_ = doses_;
      result.comment_ = comment_;
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
      if (other instanceof server.services.prescriptionsService.Drug) {
        return mergeFrom((server.services.prescriptionsService.Drug)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(server.services.prescriptionsService.Drug other) {
      if (other == server.services.prescriptionsService.Drug.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getPrescriptionsId().isEmpty()) {
        prescriptionsId_ = other.prescriptionsId_;
        onChanged();
      }
      if (!other.getDrug().isEmpty()) {
        drug_ = other.drug_;
        onChanged();
      }
      if (!other.getDoses().isEmpty()) {
        doses_ = other.doses_;
        onChanged();
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
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
      server.services.prescriptionsService.Drug parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (server.services.prescriptionsService.Drug) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object prescriptionsId_ = "";
    /**
     * <code>string prescriptionsId = 2;</code>
     */
    public java.lang.String getPrescriptionsId() {
      java.lang.Object ref = prescriptionsId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prescriptionsId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prescriptionsId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPrescriptionsIdBytes() {
      java.lang.Object ref = prescriptionsId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prescriptionsId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prescriptionsId = 2;</code>
     */
    public Builder setPrescriptionsId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prescriptionsId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prescriptionsId = 2;</code>
     */
    public Builder clearPrescriptionsId() {
      
      prescriptionsId_ = getDefaultInstance().getPrescriptionsId();
      onChanged();
      return this;
    }
    /**
     * <code>string prescriptionsId = 2;</code>
     */
    public Builder setPrescriptionsIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prescriptionsId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object drug_ = "";
    /**
     * <code>string drug = 3;</code>
     */
    public java.lang.String getDrug() {
      java.lang.Object ref = drug_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        drug_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string drug = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDrugBytes() {
      java.lang.Object ref = drug_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        drug_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string drug = 3;</code>
     */
    public Builder setDrug(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      drug_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string drug = 3;</code>
     */
    public Builder clearDrug() {
      
      drug_ = getDefaultInstance().getDrug();
      onChanged();
      return this;
    }
    /**
     * <code>string drug = 3;</code>
     */
    public Builder setDrugBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      drug_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object doses_ = "";
    /**
     * <code>string doses = 4;</code>
     */
    public java.lang.String getDoses() {
      java.lang.Object ref = doses_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        doses_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string doses = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDosesBytes() {
      java.lang.Object ref = doses_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        doses_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string doses = 4;</code>
     */
    public Builder setDoses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      doses_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string doses = 4;</code>
     */
    public Builder clearDoses() {
      
      doses_ = getDefaultInstance().getDoses();
      onChanged();
      return this;
    }
    /**
     * <code>string doses = 4;</code>
     */
    public Builder setDosesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      doses_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object comment_ = "";
    /**
     * <code>string comment = 5;</code>
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string comment = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string comment = 5;</code>
     */
    public Builder setComment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 5;</code>
     */
    public Builder clearComment() {
      
      comment_ = getDefaultInstance().getComment();
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 5;</code>
     */
    public Builder setCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comment_ = value;
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


    // @@protoc_insertion_point(builder_scope:prescriptionsService.Drug)
  }

  // @@protoc_insertion_point(class_scope:prescriptionsService.Drug)
  private static final server.services.prescriptionsService.Drug DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new server.services.prescriptionsService.Drug();
  }

  public static server.services.prescriptionsService.Drug getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Drug>
      PARSER = new com.google.protobuf.AbstractParser<Drug>() {
    @java.lang.Override
    public Drug parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Drug(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Drug> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Drug> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public server.services.prescriptionsService.Drug getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

