// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarUpdateFocusNotify.proto

public final class EvtAvatarUpdateFocusNotifyOuterClass {
  private EvtAvatarUpdateFocusNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarUpdateFocusNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarUpdateFocusNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The forwardType.
     */
    ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.Rotation focusForward = 3;</code>
     * @return Whether the focusForward field is set.
     */
    boolean hasFocusForward();
    /**
     * <code>.Rotation focusForward = 3;</code>
     * @return The focusForward.
     */
    RotationOuterClass.Rotation getFocusForward();
    /**
     * <code>.Rotation focusForward = 3;</code>
     */
    RotationOuterClass.RotationOrBuilder getFocusForwardOrBuilder();
  }
  /**
   * Protobuf type {@code EvtAvatarUpdateFocusNotify}
   */
  public static final class EvtAvatarUpdateFocusNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarUpdateFocusNotify)
      EvtAvatarUpdateFocusNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarUpdateFocusNotify.newBuilder() to construct.
    private EvtAvatarUpdateFocusNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarUpdateFocusNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarUpdateFocusNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAvatarUpdateFocusNotify(
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
            case 26: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (focusForward_ != null) {
                subBuilder = focusForward_.toBuilder();
              }
              focusForward_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(focusForward_);
                focusForward_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
      return EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EvtAvatarUpdateFocusNotify.MBMKKADEAPP}
     */
    public enum MBMKKADEAPP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 318;</code>
       */
      PEPPOHPHJOJ(1, 318),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MBMKKADEAPP DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MBMKKADEAPP EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 318;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 318;
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
      public static MBMKKADEAPP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MBMKKADEAPP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 318: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MBMKKADEAPP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MBMKKADEAPP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MBMKKADEAPP>() {
              public MBMKKADEAPP findValueByNumber(int number) {
                return MBMKKADEAPP.forNumber(number);
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
        return EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final MBMKKADEAPP[] VALUES = getStaticValuesArray();
      private static MBMKKADEAPP[] getStaticValuesArray() {
        return new MBMKKADEAPP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MBMKKADEAPP valueOf(
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

      private MBMKKADEAPP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EvtAvatarUpdateFocusNotify.MBMKKADEAPP)
    }

    public static final int ENTITYID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FORWARDTYPE_FIELD_NUMBER = 15;
    private int forwardType_;
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The forwardType.
     */
    @java.lang.Override public ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int FOCUSFORWARD_FIELD_NUMBER = 3;
    private RotationOuterClass.Rotation focusForward_;
    /**
     * <code>.Rotation focusForward = 3;</code>
     * @return Whether the focusForward field is set.
     */
    @java.lang.Override
    public boolean hasFocusForward() {
      return focusForward_ != null;
    }
    /**
     * <code>.Rotation focusForward = 3;</code>
     * @return The focusForward.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getFocusForward() {
      return focusForward_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : focusForward_;
    }
    /**
     * <code>.Rotation focusForward = 3;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getFocusForwardOrBuilder() {
      return getFocusForward();
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
      if (focusForward_ != null) {
        output.writeMessage(3, getFocusForward());
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(15, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (focusForward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getFocusForward());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, forwardType_);
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
      if (!(obj instanceof EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)) {
        return super.equals(obj);
      }
      EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other = (EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (forwardType_ != other.forwardType_) return false;
      if (hasFocusForward() != other.hasFocusForward()) return false;
      if (hasFocusForward()) {
        if (!getFocusForward()
            .equals(other.getFocusForward())) return false;
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
      hash = (37 * hash) + FORWARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      if (hasFocusForward()) {
        hash = (37 * hash) + FOCUSFORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getFocusForward().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
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
    public static Builder newBuilder(EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify prototype) {
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
     * Protobuf type {@code EvtAvatarUpdateFocusNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarUpdateFocusNotify)
        EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
      }

      // Construct using EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.newBuilder()
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

        forwardType_ = 0;

        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      public EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
        return EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance();
      }

      @java.lang.Override
      public EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify build() {
        EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify buildPartial() {
        EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = new EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify(this);
        result.entityId_ = entityId_;
        result.forwardType_ = forwardType_;
        if (focusForwardBuilder_ == null) {
          result.focusForward_ = focusForward_;
        } else {
          result.focusForward_ = focusForwardBuilder_.build();
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
        if (other instanceof EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) {
          return mergeFrom((EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other) {
        if (other == EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasFocusForward()) {
          mergeFocusForward(other.getFocusForward());
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
        EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) e.getUnfinishedMessage();
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
       * <code>uint32 entityId = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation focusForward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> focusForwardBuilder_;
      /**
       * <code>.Rotation focusForward = 3;</code>
       * @return Whether the focusForward field is set.
       */
      public boolean hasFocusForward() {
        return focusForwardBuilder_ != null || focusForward_ != null;
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       * @return The focusForward.
       */
      public RotationOuterClass.Rotation getFocusForward() {
        if (focusForwardBuilder_ == null) {
          return focusForward_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : focusForward_;
        } else {
          return focusForwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public Builder setFocusForward(RotationOuterClass.Rotation value) {
        if (focusForwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          focusForward_ = value;
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public Builder setFocusForward(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (focusForwardBuilder_ == null) {
          focusForward_ = builderForValue.build();
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public Builder mergeFocusForward(RotationOuterClass.Rotation value) {
        if (focusForwardBuilder_ == null) {
          if (focusForward_ != null) {
            focusForward_ =
              RotationOuterClass.Rotation.newBuilder(focusForward_).mergeFrom(value).buildPartial();
          } else {
            focusForward_ = value;
          }
          onChanged();
        } else {
          focusForwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public Builder clearFocusForward() {
        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
          onChanged();
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public RotationOuterClass.Rotation.Builder getFocusForwardBuilder() {
        
        onChanged();
        return getFocusForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      public RotationOuterClass.RotationOrBuilder getFocusForwardOrBuilder() {
        if (focusForwardBuilder_ != null) {
          return focusForwardBuilder_.getMessageOrBuilder();
        } else {
          return focusForward_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : focusForward_;
        }
      }
      /**
       * <code>.Rotation focusForward = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getFocusForwardFieldBuilder() {
        if (focusForwardBuilder_ == null) {
          focusForwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getFocusForward(),
                  getParentForChildren(),
                  isClean());
          focusForward_ = null;
        }
        return focusForwardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarUpdateFocusNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarUpdateFocusNotify)
    private static final EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify();
    }

    public static EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarUpdateFocusNotify>() {
      @java.lang.Override
      public EvtAvatarUpdateFocusNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAvatarUpdateFocusNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarUpdateFocusNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAvatarUpdateFocusNotify.proto\032\021Forw" +
      "ardType.proto\032\016Rotation.proto\"\324\001\n\032EvtAva" +
      "tarUpdateFocusNotify\022\020\n\010entityId\030\005 \001(\r\022!" +
      "\n\013forwardType\030\017 \001(\0162\014.ForwardType\022\037\n\014foc" +
      "usForward\030\003 \001(\0132\t.Rotation\"`\n\013MBMKKADEAP" +
      "P\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\276\002\022\017\n\013DCDNILF" +
      "DFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001" +
      "\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ForwardTypeOuterClass.getDescriptor(),
          RotationOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarUpdateFocusNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarUpdateFocusNotify_descriptor,
        new java.lang.String[] { "EntityId", "ForwardType", "FocusForward", });
    ForwardTypeOuterClass.getDescriptor();
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
