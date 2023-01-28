// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillPreviewCardInfo.proto

public final class GCGSkillPreviewCardInfoOuterClass {
  private GCGSkillPreviewCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillPreviewCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillPreviewCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGZoneType zoneType = 13;</code>
     * @return The enum numeric value on the wire for zoneType.
     */
    int getZoneTypeValue();
    /**
     * <code>.GCGZoneType zoneType = 13;</code>
     * @return The zoneType.
     */
    GCGZoneTypeOuterClass.GCGZoneType getZoneType();

    /**
     * <code>uint32 controllerId = 1;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint32 ownerCardGuid = 7;</code>
     * @return The ownerCardGuid.
     */
    int getOwnerCardGuid();

    /**
     * <code>uint32 cardGuid = 12;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cardId = 5;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * Protobuf type {@code GCGSkillPreviewCardInfo}
   */
  public static final class GCGSkillPreviewCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillPreviewCardInfo)
      GCGSkillPreviewCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillPreviewCardInfo.newBuilder() to construct.
    private GCGSkillPreviewCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillPreviewCardInfo() {
      zoneType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillPreviewCardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSkillPreviewCardInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 40: {

              cardId_ = input.readUInt32();
              break;
            }
            case 56: {

              ownerCardGuid_ = input.readUInt32();
              break;
            }
            case 80: {

              retcode_ = input.readUInt32();
              break;
            }
            case 96: {

              cardGuid_ = input.readUInt32();
              break;
            }
            case 104: {
              int rawValue = input.readEnum();

              zoneType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.class, GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.Builder.class);
    }

    public static final int ZONETYPE_FIELD_NUMBER = 13;
    private int zoneType_;
    /**
     * <code>.GCGZoneType zoneType = 13;</code>
     * @return The enum numeric value on the wire for zoneType.
     */
    @java.lang.Override public int getZoneTypeValue() {
      return zoneType_;
    }
    /**
     * <code>.GCGZoneType zoneType = 13;</code>
     * @return The zoneType.
     */
    @java.lang.Override public GCGZoneTypeOuterClass.GCGZoneType getZoneType() {
      @SuppressWarnings("deprecation")
      GCGZoneTypeOuterClass.GCGZoneType result = GCGZoneTypeOuterClass.GCGZoneType.valueOf(zoneType_);
      return result == null ? GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 1;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 1;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int OWNERCARDGUID_FIELD_NUMBER = 7;
    private int ownerCardGuid_;
    /**
     * <code>uint32 ownerCardGuid = 7;</code>
     * @return The ownerCardGuid.
     */
    @java.lang.Override
    public int getOwnerCardGuid() {
      return ownerCardGuid_;
    }

    public static final int CARDGUID_FIELD_NUMBER = 12;
    private int cardGuid_;
    /**
     * <code>uint32 cardGuid = 12;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>uint32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CARDID_FIELD_NUMBER = 5;
    private int cardId_;
    /**
     * <code>uint32 cardId = 5;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (controllerId_ != 0) {
        output.writeUInt32(1, controllerId_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(5, cardId_);
      }
      if (ownerCardGuid_ != 0) {
        output.writeUInt32(7, ownerCardGuid_);
      }
      if (retcode_ != 0) {
        output.writeUInt32(10, retcode_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(12, cardGuid_);
      }
      if (zoneType_ != GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        output.writeEnum(13, zoneType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, controllerId_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cardId_);
      }
      if (ownerCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, ownerCardGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, retcode_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cardGuid_);
      }
      if (zoneType_ != GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, zoneType_);
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
      if (!(obj instanceof GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo)) {
        return super.equals(obj);
      }
      GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo other = (GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo) obj;

      if (zoneType_ != other.zoneType_) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (getOwnerCardGuid()
          != other.getOwnerCardGuid()) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ZONETYPE_FIELD_NUMBER;
      hash = (53 * hash) + zoneType_;
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + OWNERCARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerCardGuid();
      hash = (37 * hash) + CARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CARDID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
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
    public static Builder newBuilder(GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo prototype) {
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
     * Protobuf type {@code GCGSkillPreviewCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillPreviewCardInfo)
        GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.class, GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.Builder.class);
      }

      // Construct using GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.newBuilder()
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
        zoneType_ = 0;

        controllerId_ = 0;

        ownerCardGuid_ = 0;

        cardGuid_ = 0;

        retcode_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
      }

      @java.lang.Override
      public GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstanceForType() {
        return GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo build() {
        GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo buildPartial() {
        GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo result = new GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo(this);
        result.zoneType_ = zoneType_;
        result.controllerId_ = controllerId_;
        result.ownerCardGuid_ = ownerCardGuid_;
        result.cardGuid_ = cardGuid_;
        result.retcode_ = retcode_;
        result.cardId_ = cardId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo) {
          return mergeFrom((GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo other) {
        if (other == GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.getDefaultInstance()) return this;
        if (other.zoneType_ != 0) {
          setZoneTypeValue(other.getZoneTypeValue());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getOwnerCardGuid() != 0) {
          setOwnerCardGuid(other.getOwnerCardGuid());
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int zoneType_ = 0;
      /**
       * <code>.GCGZoneType zoneType = 13;</code>
       * @return The enum numeric value on the wire for zoneType.
       */
      @java.lang.Override public int getZoneTypeValue() {
        return zoneType_;
      }
      /**
       * <code>.GCGZoneType zoneType = 13;</code>
       * @param value The enum numeric value on the wire for zoneType to set.
       * @return This builder for chaining.
       */
      public Builder setZoneTypeValue(int value) {
        
        zoneType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zoneType = 13;</code>
       * @return The zoneType.
       */
      @java.lang.Override
      public GCGZoneTypeOuterClass.GCGZoneType getZoneType() {
        @SuppressWarnings("deprecation")
        GCGZoneTypeOuterClass.GCGZoneType result = GCGZoneTypeOuterClass.GCGZoneType.valueOf(zoneType_);
        return result == null ? GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGZoneType zoneType = 13;</code>
       * @param value The zoneType to set.
       * @return This builder for chaining.
       */
      public Builder setZoneType(GCGZoneTypeOuterClass.GCGZoneType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        zoneType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zoneType = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearZoneType() {
        
        zoneType_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 1;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 1;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int ownerCardGuid_ ;
      /**
       * <code>uint32 ownerCardGuid = 7;</code>
       * @return The ownerCardGuid.
       */
      @java.lang.Override
      public int getOwnerCardGuid() {
        return ownerCardGuid_;
      }
      /**
       * <code>uint32 ownerCardGuid = 7;</code>
       * @param value The ownerCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerCardGuid(int value) {
        
        ownerCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ownerCardGuid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerCardGuid() {
        
        ownerCardGuid_ = 0;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 cardGuid = 12;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 cardGuid = 12;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardGuid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>uint32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>uint32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 cardId = 5;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 cardId = 5;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGSkillPreviewCardInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillPreviewCardInfo)
    private static final GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo();
    }

    public static GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillPreviewCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillPreviewCardInfo>() {
      @java.lang.Override
      public GCGSkillPreviewCardInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSkillPreviewCardInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSkillPreviewCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillPreviewCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillPreviewCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGSkillPreviewCardInfo.proto\032\021GCGZone" +
      "Type.proto\"\231\001\n\027GCGSkillPreviewCardInfo\022\036" +
      "\n\010zoneType\030\r \001(\0162\014.GCGZoneType\022\024\n\014contro" +
      "llerId\030\001 \001(\r\022\025\n\rownerCardGuid\030\007 \001(\r\022\020\n\010c" +
      "ardGuid\030\014 \001(\r\022\017\n\007retcode\030\n \001(\r\022\016\n\006cardId" +
      "\030\005 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GCGZoneTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGSkillPreviewCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillPreviewCardInfo_descriptor,
        new java.lang.String[] { "ZoneType", "ControllerId", "OwnerCardGuid", "CardGuid", "Retcode", "CardId", });
    GCGZoneTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
