// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LaunchFireworksReq.proto

public final class LaunchFireworksReqOuterClass {
  private LaunchFireworksReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LaunchFireworksReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LaunchFireworksReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     * @return Whether the schemeData field is set.
     */
    boolean hasSchemeData();
    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     * @return The schemeData.
     */
    FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData();
    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     */
    FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder();
  }
  /**
   * Protobuf type {@code LaunchFireworksReq}
   */
  public static final class LaunchFireworksReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LaunchFireworksReq)
      LaunchFireworksReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LaunchFireworksReq.newBuilder() to construct.
    private LaunchFireworksReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LaunchFireworksReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LaunchFireworksReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LaunchFireworksReq(
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
            case 10: {
              FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder subBuilder = null;
              if (schemeData_ != null) {
                subBuilder = schemeData_.toBuilder();
              }
              schemeData_ = input.readMessage(FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(schemeData_);
                schemeData_ = subBuilder.buildPartial();
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
      return LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LaunchFireworksReqOuterClass.LaunchFireworksReq.class, LaunchFireworksReqOuterClass.LaunchFireworksReq.Builder.class);
    }

    /**
     * Protobuf enum {@code LaunchFireworksReq.MCIHLAOBBDE}
     */
    public enum MCIHLAOBBDE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5921;</code>
       */
      PEPPOHPHJOJ(1, 5921),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MCIHLAOBBDE DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MCIHLAOBBDE EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5921;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5921;
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
      public static MCIHLAOBBDE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MCIHLAOBBDE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5921: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MCIHLAOBBDE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MCIHLAOBBDE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MCIHLAOBBDE>() {
              public MCIHLAOBBDE findValueByNumber(int number) {
                return MCIHLAOBBDE.forNumber(number);
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
        return LaunchFireworksReqOuterClass.LaunchFireworksReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final MCIHLAOBBDE[] VALUES = getStaticValuesArray();
      private static MCIHLAOBBDE[] getStaticValuesArray() {
        return new MCIHLAOBBDE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MCIHLAOBBDE valueOf(
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

      private MCIHLAOBBDE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LaunchFireworksReq.MCIHLAOBBDE)
    }

    public static final int SCHEMEDATA_FIELD_NUMBER = 1;
    private FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData schemeData_;
    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     * @return Whether the schemeData field is set.
     */
    @java.lang.Override
    public boolean hasSchemeData() {
      return schemeData_ != null;
    }
    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     * @return The schemeData.
     */
    @java.lang.Override
    public FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData() {
      return schemeData_ == null ? FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
    }
    /**
     * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
     */
    @java.lang.Override
    public FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder() {
      return getSchemeData();
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
      if (schemeData_ != null) {
        output.writeMessage(1, getSchemeData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (schemeData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSchemeData());
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
      if (!(obj instanceof LaunchFireworksReqOuterClass.LaunchFireworksReq)) {
        return super.equals(obj);
      }
      LaunchFireworksReqOuterClass.LaunchFireworksReq other = (LaunchFireworksReqOuterClass.LaunchFireworksReq) obj;

      if (hasSchemeData() != other.hasSchemeData()) return false;
      if (hasSchemeData()) {
        if (!getSchemeData()
            .equals(other.getSchemeData())) return false;
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
      if (hasSchemeData()) {
        hash = (37 * hash) + SCHEMEDATA_FIELD_NUMBER;
        hash = (53 * hash) + getSchemeData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
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
    public static Builder newBuilder(LaunchFireworksReqOuterClass.LaunchFireworksReq prototype) {
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
     * Protobuf type {@code LaunchFireworksReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LaunchFireworksReq)
        LaunchFireworksReqOuterClass.LaunchFireworksReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LaunchFireworksReqOuterClass.LaunchFireworksReq.class, LaunchFireworksReqOuterClass.LaunchFireworksReq.Builder.class);
      }

      // Construct using LaunchFireworksReqOuterClass.LaunchFireworksReq.newBuilder()
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
        if (schemeDataBuilder_ == null) {
          schemeData_ = null;
        } else {
          schemeData_ = null;
          schemeDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
      }

      @java.lang.Override
      public LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstanceForType() {
        return LaunchFireworksReqOuterClass.LaunchFireworksReq.getDefaultInstance();
      }

      @java.lang.Override
      public LaunchFireworksReqOuterClass.LaunchFireworksReq build() {
        LaunchFireworksReqOuterClass.LaunchFireworksReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public LaunchFireworksReqOuterClass.LaunchFireworksReq buildPartial() {
        LaunchFireworksReqOuterClass.LaunchFireworksReq result = new LaunchFireworksReqOuterClass.LaunchFireworksReq(this);
        if (schemeDataBuilder_ == null) {
          result.schemeData_ = schemeData_;
        } else {
          result.schemeData_ = schemeDataBuilder_.build();
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
        if (other instanceof LaunchFireworksReqOuterClass.LaunchFireworksReq) {
          return mergeFrom((LaunchFireworksReqOuterClass.LaunchFireworksReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LaunchFireworksReqOuterClass.LaunchFireworksReq other) {
        if (other == LaunchFireworksReqOuterClass.LaunchFireworksReq.getDefaultInstance()) return this;
        if (other.hasSchemeData()) {
          mergeSchemeData(other.getSchemeData());
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
        LaunchFireworksReqOuterClass.LaunchFireworksReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LaunchFireworksReqOuterClass.LaunchFireworksReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData schemeData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> schemeDataBuilder_;
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       * @return Whether the schemeData field is set.
       */
      public boolean hasSchemeData() {
        return schemeDataBuilder_ != null || schemeData_ != null;
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       * @return The schemeData.
       */
      public FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData() {
        if (schemeDataBuilder_ == null) {
          return schemeData_ == null ? FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
        } else {
          return schemeDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public Builder setSchemeData(FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          schemeData_ = value;
          onChanged();
        } else {
          schemeDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public Builder setSchemeData(
          FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder builderForValue) {
        if (schemeDataBuilder_ == null) {
          schemeData_ = builderForValue.build();
          onChanged();
        } else {
          schemeDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public Builder mergeSchemeData(FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataBuilder_ == null) {
          if (schemeData_ != null) {
            schemeData_ =
              FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.newBuilder(schemeData_).mergeFrom(value).buildPartial();
          } else {
            schemeData_ = value;
          }
          onChanged();
        } else {
          schemeDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public Builder clearSchemeData() {
        if (schemeDataBuilder_ == null) {
          schemeData_ = null;
          onChanged();
        } else {
          schemeData_ = null;
          schemeDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder getSchemeDataBuilder() {
        
        onChanged();
        return getSchemeDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      public FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder() {
        if (schemeDataBuilder_ != null) {
          return schemeDataBuilder_.getMessageOrBuilder();
        } else {
          return schemeData_ == null ?
              FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
        }
      }
      /**
       * <code>.FireworksLaunchSchemeData schemeData = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
          getSchemeDataFieldBuilder() {
        if (schemeDataBuilder_ == null) {
          schemeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder>(
                  getSchemeData(),
                  getParentForChildren(),
                  isClean());
          schemeData_ = null;
        }
        return schemeDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LaunchFireworksReq)
    }

    // @@protoc_insertion_point(class_scope:LaunchFireworksReq)
    private static final LaunchFireworksReqOuterClass.LaunchFireworksReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LaunchFireworksReqOuterClass.LaunchFireworksReq();
    }

    public static LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LaunchFireworksReq>
        PARSER = new com.google.protobuf.AbstractParser<LaunchFireworksReq>() {
      @java.lang.Override
      public LaunchFireworksReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LaunchFireworksReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LaunchFireworksReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LaunchFireworksReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LaunchFireworksReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LaunchFireworksReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LaunchFireworksReq.proto\032\037FireworksLau" +
      "nchSchemeData.proto\"\246\001\n\022LaunchFireworksR" +
      "eq\022.\n\nschemeData\030\001 \001(\0132\032.FireworksLaunch" +
      "SchemeData\"`\n\013MCIHLAOBBDE\022\010\n\004NONE\020\000\022\020\n\013P" +
      "EPPOHPHJOJ\020\241.\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOL" +
      "MPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          FireworksLaunchSchemeDataOuterClass.getDescriptor(),
        });
    internal_static_LaunchFireworksReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LaunchFireworksReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LaunchFireworksReq_descriptor,
        new java.lang.String[] { "SchemeData", });
    FireworksLaunchSchemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
