// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeUpdateScenePointFishFarmingInfoReq.proto

public final class HomeUpdateScenePointFishFarmingInfoReqOuterClass {
  private HomeUpdateScenePointFishFarmingInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeUpdateScenePointFishFarmingInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeUpdateScenePointFishFarmingInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     * @return Whether the fishFarmingInfo field is set.
     */
    boolean hasFishFarmingInfo();
    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     * @return The fishFarmingInfo.
     */
    HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfo();
    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     */
    HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoOrBuilder();
  }
  /**
   * Protobuf type {@code HomeUpdateScenePointFishFarmingInfoReq}
   */
  public static final class HomeUpdateScenePointFishFarmingInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeUpdateScenePointFishFarmingInfoReq)
      HomeUpdateScenePointFishFarmingInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeUpdateScenePointFishFarmingInfoReq.newBuilder() to construct.
    private HomeUpdateScenePointFishFarmingInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeUpdateScenePointFishFarmingInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeUpdateScenePointFishFarmingInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeUpdateScenePointFishFarmingInfoReq(
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
            case 82: {
              HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder subBuilder = null;
              if (fishFarmingInfo_ != null) {
                subBuilder = fishFarmingInfo_.toBuilder();
              }
              fishFarmingInfo_ = input.readMessage(HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fishFarmingInfo_);
                fishFarmingInfo_ = subBuilder.buildPartial();
              }

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
      return HomeUpdateScenePointFishFarmingInfoReqOuterClass.internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeUpdateScenePointFishFarmingInfoReqOuterClass.internal_static_HomeUpdateScenePointFishFarmingInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.class, HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeUpdateScenePointFishFarmingInfoReq.GPAELILCNFJ}
     */
    public enum GPAELILCNFJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4587;</code>
       */
      PEPPOHPHJOJ(1, 4587),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GPAELILCNFJ DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GPAELILCNFJ EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4587;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4587;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static GPAELILCNFJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GPAELILCNFJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4587: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GPAELILCNFJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GPAELILCNFJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GPAELILCNFJ>() {
              public GPAELILCNFJ findValueByNumber(int number) {
                return GPAELILCNFJ.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GPAELILCNFJ[] VALUES = getStaticValuesArray();
      private static GPAELILCNFJ[] getStaticValuesArray() {
        return new GPAELILCNFJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GPAELILCNFJ valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private GPAELILCNFJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeUpdateScenePointFishFarmingInfoReq.GPAELILCNFJ)
    }

    public static final int FISHFARMINGINFO_FIELD_NUMBER = 10;
    private HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo fishFarmingInfo_;
    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     * @return Whether the fishFarmingInfo field is set.
     */
    @java.lang.Override
    public boolean hasFishFarmingInfo() {
      return fishFarmingInfo_ != null;
    }
    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     * @return The fishFarmingInfo.
     */
    @java.lang.Override
    public HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfo() {
      return fishFarmingInfo_ == null ? HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance() : fishFarmingInfo_;
    }
    /**
     * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
     */
    @java.lang.Override
    public HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoOrBuilder() {
      return getFishFarmingInfo();
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
      if (fishFarmingInfo_ != null) {
        output.writeMessage(10, getFishFarmingInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fishFarmingInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getFishFarmingInfo());
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
      if (!(obj instanceof HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq)) {
        return super.equals(obj);
      }
      HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq other = (HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq) obj;

      if (hasFishFarmingInfo() != other.hasFishFarmingInfo()) return false;
      if (hasFishFarmingInfo()) {
        if (!getFishFarmingInfo()
            .equals(other.getFishFarmingInfo())) return false;
      }
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
      if (hasFishFarmingInfo()) {
        hash = (37 * hash) + FISHFARMINGINFO_FIELD_NUMBER;
        hash = (53 * hash) + getFishFarmingInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parseFrom(
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
    public static Builder newBuilder(HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq prototype) {
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
     * Protobuf type {@code HomeUpdateScenePointFishFarmingInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeUpdateScenePointFishFarmingInfoReq)
        HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeUpdateScenePointFishFarmingInfoReqOuterClass.internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeUpdateScenePointFishFarmingInfoReqOuterClass.internal_static_HomeUpdateScenePointFishFarmingInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.class, HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.Builder.class);
      }

      // Construct using HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.newBuilder()
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
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = null;
        } else {
          fishFarmingInfo_ = null;
          fishFarmingInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeUpdateScenePointFishFarmingInfoReqOuterClass.internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor;
      }

      @java.lang.Override
      public HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq getDefaultInstanceForType() {
        return HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq build() {
        HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq buildPartial() {
        HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq result = new HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq(this);
        if (fishFarmingInfoBuilder_ == null) {
          result.fishFarmingInfo_ = fishFarmingInfo_;
        } else {
          result.fishFarmingInfo_ = fishFarmingInfoBuilder_.build();
        }
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
        if (other instanceof HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq) {
          return mergeFrom((HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq other) {
        if (other == HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq.getDefaultInstance()) return this;
        if (other.hasFishFarmingInfo()) {
          mergeFishFarmingInfo(other.getFishFarmingInfo());
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
        HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo fishFarmingInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> fishFarmingInfoBuilder_;
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       * @return Whether the fishFarmingInfo field is set.
       */
      public boolean hasFishFarmingInfo() {
        return fishFarmingInfoBuilder_ != null || fishFarmingInfo_ != null;
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       * @return The fishFarmingInfo.
       */
      public HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfo() {
        if (fishFarmingInfoBuilder_ == null) {
          return fishFarmingInfo_ == null ? HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance() : fishFarmingInfo_;
        } else {
          return fishFarmingInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public Builder setFishFarmingInfo(HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo value) {
        if (fishFarmingInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fishFarmingInfo_ = value;
          onChanged();
        } else {
          fishFarmingInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public Builder setFishFarmingInfo(
          HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = builderForValue.build();
          onChanged();
        } else {
          fishFarmingInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public Builder mergeFishFarmingInfo(HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo value) {
        if (fishFarmingInfoBuilder_ == null) {
          if (fishFarmingInfo_ != null) {
            fishFarmingInfo_ =
              HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.newBuilder(fishFarmingInfo_).mergeFrom(value).buildPartial();
          } else {
            fishFarmingInfo_ = value;
          }
          onChanged();
        } else {
          fishFarmingInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public Builder clearFishFarmingInfo() {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = null;
          onChanged();
        } else {
          fishFarmingInfo_ = null;
          fishFarmingInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder getFishFarmingInfoBuilder() {
        
        onChanged();
        return getFishFarmingInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      public HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoOrBuilder() {
        if (fishFarmingInfoBuilder_ != null) {
          return fishFarmingInfoBuilder_.getMessageOrBuilder();
        } else {
          return fishFarmingInfo_ == null ?
              HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance() : fishFarmingInfo_;
        }
      }
      /**
       * <code>.HomeScenePointFishFarmingInfo fishFarmingInfo = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> 
          getFishFarmingInfoFieldBuilder() {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder>(
                  getFishFarmingInfo(),
                  getParentForChildren(),
                  isClean());
          fishFarmingInfo_ = null;
        }
        return fishFarmingInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeUpdateScenePointFishFarmingInfoReq)
    }

    // @@protoc_insertion_point(class_scope:HomeUpdateScenePointFishFarmingInfoReq)
    private static final HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq();
    }

    public static HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeUpdateScenePointFishFarmingInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeUpdateScenePointFishFarmingInfoReq>() {
      @java.lang.Override
      public HomeUpdateScenePointFishFarmingInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeUpdateScenePointFishFarmingInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeUpdateScenePointFishFarmingInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeUpdateScenePointFishFarmingInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeUpdateScenePointFishFarmingInfoReqOuterClass.HomeUpdateScenePointFishFarmingInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeUpdateScenePointFishFarmingInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,HomeUpdateScenePointFishFarmingInfoReq" +
      ".proto\032#HomeScenePointFishFarmingInfo.pr" +
      "oto\"\303\001\n&HomeUpdateScenePointFishFarmingI" +
      "nfoReq\0227\n\017fishFarmingInfo\030\n \001(\0132\036.HomeSc" +
      "enePointFishFarmingInfo\"`\n\013GPAELILCNFJ\022\010" +
      "\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\353#\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          HomeScenePointFishFarmingInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeUpdateScenePointFishFarmingInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeUpdateScenePointFishFarmingInfoReq_descriptor,
        new java.lang.String[] { "FishFarmingInfo", });
    HomeScenePointFishFarmingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
