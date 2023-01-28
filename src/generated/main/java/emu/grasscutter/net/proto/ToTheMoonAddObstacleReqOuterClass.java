// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonAddObstacleReq.proto

public final class ToTheMoonAddObstacleReqOuterClass {
  private ToTheMoonAddObstacleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonAddObstacleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonAddObstacleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     * @return Whether the obstacle field is set.
     */
    boolean hasObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     * @return The obstacle.
     */
    ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     */
    ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder();

    /**
     * <code>uint32 sceneId = 7;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 queryId = 5;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>bool useEdge = 15;</code>
     * @return The useEdge.
     */
    boolean getUseEdge();
  }
  /**
   * Protobuf type {@code ToTheMoonAddObstacleReq}
   */
  public static final class ToTheMoonAddObstacleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonAddObstacleReq)
      ToTheMoonAddObstacleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonAddObstacleReq.newBuilder() to construct.
    private ToTheMoonAddObstacleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonAddObstacleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonAddObstacleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonAddObstacleReq(
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
            case 40: {

              queryId_ = input.readInt32();
              break;
            }
            case 50: {
              ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder subBuilder = null;
              if (obstacle_ != null) {
                subBuilder = obstacle_.toBuilder();
              }
              obstacle_ = input.readMessage(ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(obstacle_);
                obstacle_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 120: {

              useEdge_ = input.readBool();
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
      return ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ToTheMoonAddObstacleReq.JNHMMGGPKOO}
     */
    public enum JNHMMGGPKOO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 6174;</code>
       */
      PEPPOHPHJOJ(1, 6174),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JNHMMGGPKOO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final JNHMMGGPKOO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 6174;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 6174;
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
      public static JNHMMGGPKOO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JNHMMGGPKOO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 6174: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JNHMMGGPKOO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JNHMMGGPKOO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JNHMMGGPKOO>() {
              public JNHMMGGPKOO findValueByNumber(int number) {
                return JNHMMGGPKOO.forNumber(number);
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
        return ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final JNHMMGGPKOO[] VALUES = getStaticValuesArray();
      private static JNHMMGGPKOO[] getStaticValuesArray() {
        return new JNHMMGGPKOO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static JNHMMGGPKOO valueOf(
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

      private JNHMMGGPKOO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ToTheMoonAddObstacleReq.JNHMMGGPKOO)
    }

    public static final int OBSTACLE_FIELD_NUMBER = 6;
    private ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     * @return Whether the obstacle field is set.
     */
    @java.lang.Override
    public boolean hasObstacle() {
      return obstacle_ != null;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     * @return The obstacle.
     */
    @java.lang.Override
    public ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
      return obstacle_ == null ? ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
     */
    @java.lang.Override
    public ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
      return getObstacle();
    }

    public static final int SCENEID_FIELD_NUMBER = 7;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 7;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int QUERYID_FIELD_NUMBER = 5;
    private int queryId_;
    /**
     * <code>int32 queryId = 5;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int USEEDGE_FIELD_NUMBER = 15;
    private boolean useEdge_;
    /**
     * <code>bool useEdge = 15;</code>
     * @return The useEdge.
     */
    @java.lang.Override
    public boolean getUseEdge() {
      return useEdge_;
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
      if (queryId_ != 0) {
        output.writeInt32(5, queryId_);
      }
      if (obstacle_ != null) {
        output.writeMessage(6, getObstacle());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(7, sceneId_);
      }
      if (useEdge_ != false) {
        output.writeBool(15, useEdge_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, queryId_);
      }
      if (obstacle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getObstacle());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sceneId_);
      }
      if (useEdge_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, useEdge_);
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
      if (!(obj instanceof ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)) {
        return super.equals(obj);
      }
      ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other = (ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) obj;

      if (hasObstacle() != other.hasObstacle()) return false;
      if (hasObstacle()) {
        if (!getObstacle()
            .equals(other.getObstacle())) return false;
      }
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
      if (getUseEdge()
          != other.getUseEdge()) return false;
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
      if (hasObstacle()) {
        hash = (37 * hash) + OBSTACLE_FIELD_NUMBER;
        hash = (53 * hash) + getObstacle().hashCode();
      }
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + QUERYID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (37 * hash) + USEEDGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseEdge());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
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
    public static Builder newBuilder(ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq prototype) {
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
     * Protobuf type {@code ToTheMoonAddObstacleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonAddObstacleReq)
        ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
      }

      // Construct using ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.newBuilder()
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
        if (obstacleBuilder_ == null) {
          obstacle_ = null;
        } else {
          obstacle_ = null;
          obstacleBuilder_ = null;
        }
        sceneId_ = 0;

        queryId_ = 0;

        useEdge_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      public ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
        return ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance();
      }

      @java.lang.Override
      public ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq build() {
        ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq buildPartial() {
        ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = new ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq(this);
        if (obstacleBuilder_ == null) {
          result.obstacle_ = obstacle_;
        } else {
          result.obstacle_ = obstacleBuilder_.build();
        }
        result.sceneId_ = sceneId_;
        result.queryId_ = queryId_;
        result.useEdge_ = useEdge_;
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
        if (other instanceof ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) {
          return mergeFrom((ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other) {
        if (other == ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance()) return this;
        if (other.hasObstacle()) {
          mergeObstacle(other.getObstacle());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.getUseEdge() != false) {
          setUseEdge(other.getUseEdge());
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
        ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> obstacleBuilder_;
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       * @return Whether the obstacle field is set.
       */
      public boolean hasObstacle() {
        return obstacleBuilder_ != null || obstacle_ != null;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       * @return The obstacle.
       */
      public ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
        if (obstacleBuilder_ == null) {
          return obstacle_ == null ? ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        } else {
          return obstacleBuilder_.getMessage();
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public Builder setObstacle(ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          obstacle_ = value;
          onChanged();
        } else {
          obstacleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public Builder setObstacle(
          ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder builderForValue) {
        if (obstacleBuilder_ == null) {
          obstacle_ = builderForValue.build();
          onChanged();
        } else {
          obstacleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public Builder mergeObstacle(ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (obstacle_ != null) {
            obstacle_ =
              ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.newBuilder(obstacle_).mergeFrom(value).buildPartial();
          } else {
            obstacle_ = value;
          }
          onChanged();
        } else {
          obstacleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public Builder clearObstacle() {
        if (obstacleBuilder_ == null) {
          obstacle_ = null;
          onChanged();
        } else {
          obstacle_ = null;
          obstacleBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder getObstacleBuilder() {
        
        onChanged();
        return getObstacleFieldBuilder().getBuilder();
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      public ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
        if (obstacleBuilder_ != null) {
          return obstacleBuilder_.getMessageOrBuilder();
        } else {
          return obstacle_ == null ?
              ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> 
          getObstacleFieldBuilder() {
        if (obstacleBuilder_ == null) {
          obstacleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder>(
                  getObstacle(),
                  getParentForChildren(),
                  isClean());
          obstacle_ = null;
        }
        return obstacleBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 7;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 7;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 queryId = 5;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 queryId = 5;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 queryId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private boolean useEdge_ ;
      /**
       * <code>bool useEdge = 15;</code>
       * @return The useEdge.
       */
      @java.lang.Override
      public boolean getUseEdge() {
        return useEdge_;
      }
      /**
       * <code>bool useEdge = 15;</code>
       * @param value The useEdge to set.
       * @return This builder for chaining.
       */
      public Builder setUseEdge(boolean value) {
        
        useEdge_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool useEdge = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseEdge() {
        
        useEdge_ = false;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonAddObstacleReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonAddObstacleReq)
    private static final ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq();
    }

    public static ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonAddObstacleReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonAddObstacleReq>() {
      @java.lang.Override
      public ToTheMoonAddObstacleReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonAddObstacleReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonAddObstacleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonAddObstacleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonAddObstacleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ToTheMoonAddObstacleReq.proto\032\033ToTheMo" +
      "onObstacleInfo.proto\"\330\001\n\027ToTheMoonAddObs" +
      "tacleReq\022(\n\010obstacle\030\006 \001(\0132\026.ToTheMoonOb" +
      "stacleInfo\022\017\n\007sceneId\030\007 \001(\r\022\017\n\007queryId\030\005" +
      " \001(\005\022\017\n\007useEdge\030\017 \001(\010\"`\n\013JNHMMGGPKOO\022\010\n\004" +
      "NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\2360\022\017\n\013DCDNILFDFLB\020" +
      "\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ToTheMoonObstacleInfoOuterClass.getDescriptor(),
        });
    internal_static_ToTheMoonAddObstacleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonAddObstacleReq_descriptor,
        new java.lang.String[] { "Obstacle", "SceneId", "QueryId", "UseEdge", });
    ToTheMoonObstacleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
