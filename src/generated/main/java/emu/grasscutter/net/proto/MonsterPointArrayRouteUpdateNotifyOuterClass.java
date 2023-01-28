// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterPointArrayRouteUpdateNotify.proto

public final class MonsterPointArrayRouteUpdateNotifyOuterClass {
  private MonsterPointArrayRouteUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterPointArrayRouteUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterPointArrayRouteUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 12;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     * @return Whether the monsterRoute field is set.
     */
    boolean hasMonsterRoute();
    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     * @return The monsterRoute.
     */
    MonsterRouteOuterClass.MonsterRoute getMonsterRoute();
    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     */
    MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder();
  }
  /**
   * Protobuf type {@code MonsterPointArrayRouteUpdateNotify}
   */
  public static final class MonsterPointArrayRouteUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterPointArrayRouteUpdateNotify)
      MonsterPointArrayRouteUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterPointArrayRouteUpdateNotify.newBuilder() to construct.
    private MonsterPointArrayRouteUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterPointArrayRouteUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterPointArrayRouteUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterPointArrayRouteUpdateNotify(
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
            case 18: {
              MonsterRouteOuterClass.MonsterRoute.Builder subBuilder = null;
              if (monsterRoute_ != null) {
                subBuilder = monsterRoute_.toBuilder();
              }
              monsterRoute_ = input.readMessage(MonsterRouteOuterClass.MonsterRoute.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(monsterRoute_);
                monsterRoute_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              entityId_ = input.readUInt32();
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
      return MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.class, MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MonsterPointArrayRouteUpdateNotify.KDIIOAFKLLL}
     */
    public enum KDIIOAFKLLL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 3271;</code>
       */
      PEPPOHPHJOJ(1, 3271),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KDIIOAFKLLL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 3271;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 3271;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static KDIIOAFKLLL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KDIIOAFKLLL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 3271: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KDIIOAFKLLL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KDIIOAFKLLL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KDIIOAFKLLL>() {
              public KDIIOAFKLLL findValueByNumber(int number) {
                return KDIIOAFKLLL.forNumber(number);
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
        return MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final KDIIOAFKLLL[] VALUES = getStaticValuesArray();
      private static KDIIOAFKLLL[] getStaticValuesArray() {
        return new KDIIOAFKLLL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static KDIIOAFKLLL valueOf(
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

      private KDIIOAFKLLL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MonsterPointArrayRouteUpdateNotify.KDIIOAFKLLL)
    }

    public static final int ENTITYID_FIELD_NUMBER = 12;
    private int entityId_;
    /**
     * <code>uint32 entityId = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int MONSTERROUTE_FIELD_NUMBER = 2;
    private MonsterRouteOuterClass.MonsterRoute monsterRoute_;
    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     * @return Whether the monsterRoute field is set.
     */
    @java.lang.Override
    public boolean hasMonsterRoute() {
      return monsterRoute_ != null;
    }
    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     * @return The monsterRoute.
     */
    @java.lang.Override
    public MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
      return monsterRoute_ == null ? MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
    }
    /**
     * <code>.MonsterRoute monsterRoute = 2;</code>
     */
    @java.lang.Override
    public MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
      return getMonsterRoute();
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
      if (monsterRoute_ != null) {
        output.writeMessage(2, getMonsterRoute());
      }
      if (entityId_ != 0) {
        output.writeUInt32(12, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterRoute_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMonsterRoute());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, entityId_);
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
      if (!(obj instanceof MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify)) {
        return super.equals(obj);
      }
      MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify other = (MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasMonsterRoute() != other.hasMonsterRoute()) return false;
      if (hasMonsterRoute()) {
        if (!getMonsterRoute()
            .equals(other.getMonsterRoute())) return false;
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasMonsterRoute()) {
        hash = (37 * hash) + MONSTERROUTE_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterRoute().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
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
    public static Builder newBuilder(MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify prototype) {
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
     * Protobuf type {@code MonsterPointArrayRouteUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterPointArrayRouteUpdateNotify)
        MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.class, MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.Builder.class);
      }

      // Construct using MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.newBuilder()
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
        entityId_ = 0;

        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = null;
        } else {
          monsterRoute_ = null;
          monsterRouteBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
      }

      @java.lang.Override
      public MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstanceForType() {
        return MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify build() {
        MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify buildPartial() {
        MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify result = new MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify(this);
        result.entityId_ = entityId_;
        if (monsterRouteBuilder_ == null) {
          result.monsterRoute_ = monsterRoute_;
        } else {
          result.monsterRoute_ = monsterRouteBuilder_.build();
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
        if (other instanceof MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) {
          return mergeFrom((MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify other) {
        if (other == MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasMonsterRoute()) {
          mergeMonsterRoute(other.getMonsterRoute());
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
        MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 12;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 12;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private MonsterRouteOuterClass.MonsterRoute monsterRoute_;
      private com.google.protobuf.SingleFieldBuilderV3<
          MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder> monsterRouteBuilder_;
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       * @return Whether the monsterRoute field is set.
       */
      public boolean hasMonsterRoute() {
        return monsterRouteBuilder_ != null || monsterRoute_ != null;
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       * @return The monsterRoute.
       */
      public MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
        if (monsterRouteBuilder_ == null) {
          return monsterRoute_ == null ? MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
        } else {
          return monsterRouteBuilder_.getMessage();
        }
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public Builder setMonsterRoute(MonsterRouteOuterClass.MonsterRoute value) {
        if (monsterRouteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monsterRoute_ = value;
          onChanged();
        } else {
          monsterRouteBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public Builder setMonsterRoute(
          MonsterRouteOuterClass.MonsterRoute.Builder builderForValue) {
        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = builderForValue.build();
          onChanged();
        } else {
          monsterRouteBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public Builder mergeMonsterRoute(MonsterRouteOuterClass.MonsterRoute value) {
        if (monsterRouteBuilder_ == null) {
          if (monsterRoute_ != null) {
            monsterRoute_ =
              MonsterRouteOuterClass.MonsterRoute.newBuilder(monsterRoute_).mergeFrom(value).buildPartial();
          } else {
            monsterRoute_ = value;
          }
          onChanged();
        } else {
          monsterRouteBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public Builder clearMonsterRoute() {
        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = null;
          onChanged();
        } else {
          monsterRoute_ = null;
          monsterRouteBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public MonsterRouteOuterClass.MonsterRoute.Builder getMonsterRouteBuilder() {
        
        onChanged();
        return getMonsterRouteFieldBuilder().getBuilder();
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      public MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
        if (monsterRouteBuilder_ != null) {
          return monsterRouteBuilder_.getMessageOrBuilder();
        } else {
          return monsterRoute_ == null ?
              MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
        }
      }
      /**
       * <code>.MonsterRoute monsterRoute = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder> 
          getMonsterRouteFieldBuilder() {
        if (monsterRouteBuilder_ == null) {
          monsterRouteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder>(
                  getMonsterRoute(),
                  getParentForChildren(),
                  isClean());
          monsterRoute_ = null;
        }
        return monsterRouteBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MonsterPointArrayRouteUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:MonsterPointArrayRouteUpdateNotify)
    private static final MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify();
    }

    public static MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<MonsterPointArrayRouteUpdateNotify>() {
      @java.lang.Override
      public MonsterPointArrayRouteUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterPointArrayRouteUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(MonsterPointArrayRouteUpdateNotify.pro" +
      "to\032\022MonsterRoute.proto\"\254\001\n\"MonsterPointA" +
      "rrayRouteUpdateNotify\022\020\n\010entityId\030\014 \001(\r\022" +
      "#\n\014monsterRoute\030\002 \001(\0132\r.MonsterRoute\"O\n\013" +
      "KDIIOAFKLLL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\307\031\022" +
      "\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MonsterRouteOuterClass.getDescriptor(),
        });
    internal_static_MonsterPointArrayRouteUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterPointArrayRouteUpdateNotify_descriptor,
        new java.lang.String[] { "EntityId", "MonsterRoute", });
    MonsterRouteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
