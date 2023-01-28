// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuyGoodsReq.proto

public final class BuyGoodsReqOuterClass {
  private BuyGoodsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuyGoodsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuyGoodsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 buyCount = 14;</code>
     * @return The buyCount.
     */
    int getBuyCount();

    /**
     * <code>uint32 shopType = 5;</code>
     * @return The shopType.
     */
    int getShopType();

    /**
     * <code>.ShopGoods goods = 3;</code>
     * @return Whether the goods field is set.
     */
    boolean hasGoods();
    /**
     * <code>.ShopGoods goods = 3;</code>
     * @return The goods.
     */
    ShopGoodsOuterClass.ShopGoods getGoods();
    /**
     * <code>.ShopGoods goods = 3;</code>
     */
    ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder();
  }
  /**
   * Protobuf type {@code BuyGoodsReq}
   */
  public static final class BuyGoodsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuyGoodsReq)
      BuyGoodsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuyGoodsReq.newBuilder() to construct.
    private BuyGoodsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuyGoodsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuyGoodsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BuyGoodsReq(
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
              ShopGoodsOuterClass.ShopGoods.Builder subBuilder = null;
              if (goods_ != null) {
                subBuilder = goods_.toBuilder();
              }
              goods_ = input.readMessage(ShopGoodsOuterClass.ShopGoods.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(goods_);
                goods_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              shopType_ = input.readUInt32();
              break;
            }
            case 112: {

              buyCount_ = input.readUInt32();
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
      return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BuyGoodsReqOuterClass.BuyGoodsReq.class, BuyGoodsReqOuterClass.BuyGoodsReq.Builder.class);
    }

    /**
     * Protobuf enum {@code BuyGoodsReq.ELOCMPDKODO}
     */
    public enum ELOCMPDKODO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 787;</code>
       */
      PEPPOHPHJOJ(1, 787),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ELOCMPDKODO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final ELOCMPDKODO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 787;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 787;
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
      public static ELOCMPDKODO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ELOCMPDKODO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 787: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ELOCMPDKODO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ELOCMPDKODO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ELOCMPDKODO>() {
              public ELOCMPDKODO findValueByNumber(int number) {
                return ELOCMPDKODO.forNumber(number);
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
        return BuyGoodsReqOuterClass.BuyGoodsReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final ELOCMPDKODO[] VALUES = getStaticValuesArray();
      private static ELOCMPDKODO[] getStaticValuesArray() {
        return new ELOCMPDKODO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static ELOCMPDKODO valueOf(
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

      private ELOCMPDKODO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:BuyGoodsReq.ELOCMPDKODO)
    }

    public static final int BUYCOUNT_FIELD_NUMBER = 14;
    private int buyCount_;
    /**
     * <code>uint32 buyCount = 14;</code>
     * @return The buyCount.
     */
    @java.lang.Override
    public int getBuyCount() {
      return buyCount_;
    }

    public static final int SHOPTYPE_FIELD_NUMBER = 5;
    private int shopType_;
    /**
     * <code>uint32 shopType = 5;</code>
     * @return The shopType.
     */
    @java.lang.Override
    public int getShopType() {
      return shopType_;
    }

    public static final int GOODS_FIELD_NUMBER = 3;
    private ShopGoodsOuterClass.ShopGoods goods_;
    /**
     * <code>.ShopGoods goods = 3;</code>
     * @return Whether the goods field is set.
     */
    @java.lang.Override
    public boolean hasGoods() {
      return goods_ != null;
    }
    /**
     * <code>.ShopGoods goods = 3;</code>
     * @return The goods.
     */
    @java.lang.Override
    public ShopGoodsOuterClass.ShopGoods getGoods() {
      return goods_ == null ? ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
    }
    /**
     * <code>.ShopGoods goods = 3;</code>
     */
    @java.lang.Override
    public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
      return getGoods();
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
      if (goods_ != null) {
        output.writeMessage(3, getGoods());
      }
      if (shopType_ != 0) {
        output.writeUInt32(5, shopType_);
      }
      if (buyCount_ != 0) {
        output.writeUInt32(14, buyCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (goods_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getGoods());
      }
      if (shopType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, shopType_);
      }
      if (buyCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, buyCount_);
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
      if (!(obj instanceof BuyGoodsReqOuterClass.BuyGoodsReq)) {
        return super.equals(obj);
      }
      BuyGoodsReqOuterClass.BuyGoodsReq other = (BuyGoodsReqOuterClass.BuyGoodsReq) obj;

      if (getBuyCount()
          != other.getBuyCount()) return false;
      if (getShopType()
          != other.getShopType()) return false;
      if (hasGoods() != other.hasGoods()) return false;
      if (hasGoods()) {
        if (!getGoods()
            .equals(other.getGoods())) return false;
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
      hash = (37 * hash) + BUYCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBuyCount();
      hash = (37 * hash) + SHOPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShopType();
      if (hasGoods()) {
        hash = (37 * hash) + GOODS_FIELD_NUMBER;
        hash = (53 * hash) + getGoods().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
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
    public static Builder newBuilder(BuyGoodsReqOuterClass.BuyGoodsReq prototype) {
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
     * Protobuf type {@code BuyGoodsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuyGoodsReq)
        BuyGoodsReqOuterClass.BuyGoodsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BuyGoodsReqOuterClass.BuyGoodsReq.class, BuyGoodsReqOuterClass.BuyGoodsReq.Builder.class);
      }

      // Construct using BuyGoodsReqOuterClass.BuyGoodsReq.newBuilder()
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
        buyCount_ = 0;

        shopType_ = 0;

        if (goodsBuilder_ == null) {
          goods_ = null;
        } else {
          goods_ = null;
          goodsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
      }

      @java.lang.Override
      public BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstanceForType() {
        return BuyGoodsReqOuterClass.BuyGoodsReq.getDefaultInstance();
      }

      @java.lang.Override
      public BuyGoodsReqOuterClass.BuyGoodsReq build() {
        BuyGoodsReqOuterClass.BuyGoodsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public BuyGoodsReqOuterClass.BuyGoodsReq buildPartial() {
        BuyGoodsReqOuterClass.BuyGoodsReq result = new BuyGoodsReqOuterClass.BuyGoodsReq(this);
        result.buyCount_ = buyCount_;
        result.shopType_ = shopType_;
        if (goodsBuilder_ == null) {
          result.goods_ = goods_;
        } else {
          result.goods_ = goodsBuilder_.build();
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
        if (other instanceof BuyGoodsReqOuterClass.BuyGoodsReq) {
          return mergeFrom((BuyGoodsReqOuterClass.BuyGoodsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BuyGoodsReqOuterClass.BuyGoodsReq other) {
        if (other == BuyGoodsReqOuterClass.BuyGoodsReq.getDefaultInstance()) return this;
        if (other.getBuyCount() != 0) {
          setBuyCount(other.getBuyCount());
        }
        if (other.getShopType() != 0) {
          setShopType(other.getShopType());
        }
        if (other.hasGoods()) {
          mergeGoods(other.getGoods());
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
        BuyGoodsReqOuterClass.BuyGoodsReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BuyGoodsReqOuterClass.BuyGoodsReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int buyCount_ ;
      /**
       * <code>uint32 buyCount = 14;</code>
       * @return The buyCount.
       */
      @java.lang.Override
      public int getBuyCount() {
        return buyCount_;
      }
      /**
       * <code>uint32 buyCount = 14;</code>
       * @param value The buyCount to set.
       * @return This builder for chaining.
       */
      public Builder setBuyCount(int value) {
        
        buyCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buyCount = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuyCount() {
        
        buyCount_ = 0;
        onChanged();
        return this;
      }

      private int shopType_ ;
      /**
       * <code>uint32 shopType = 5;</code>
       * @return The shopType.
       */
      @java.lang.Override
      public int getShopType() {
        return shopType_;
      }
      /**
       * <code>uint32 shopType = 5;</code>
       * @param value The shopType to set.
       * @return This builder for chaining.
       */
      public Builder setShopType(int value) {
        
        shopType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shopType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopType() {
        
        shopType_ = 0;
        onChanged();
        return this;
      }

      private ShopGoodsOuterClass.ShopGoods goods_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsBuilder_;
      /**
       * <code>.ShopGoods goods = 3;</code>
       * @return Whether the goods field is set.
       */
      public boolean hasGoods() {
        return goodsBuilder_ != null || goods_ != null;
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       * @return The goods.
       */
      public ShopGoodsOuterClass.ShopGoods getGoods() {
        if (goodsBuilder_ == null) {
          return goods_ == null ? ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
        } else {
          return goodsBuilder_.getMessage();
        }
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public Builder setGoods(ShopGoodsOuterClass.ShopGoods value) {
        if (goodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          goods_ = value;
          onChanged();
        } else {
          goodsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public Builder setGoods(
          ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
        if (goodsBuilder_ == null) {
          goods_ = builderForValue.build();
          onChanged();
        } else {
          goodsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public Builder mergeGoods(ShopGoodsOuterClass.ShopGoods value) {
        if (goodsBuilder_ == null) {
          if (goods_ != null) {
            goods_ =
              ShopGoodsOuterClass.ShopGoods.newBuilder(goods_).mergeFrom(value).buildPartial();
          } else {
            goods_ = value;
          }
          onChanged();
        } else {
          goodsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public Builder clearGoods() {
        if (goodsBuilder_ == null) {
          goods_ = null;
          onChanged();
        } else {
          goods_ = null;
          goodsBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public ShopGoodsOuterClass.ShopGoods.Builder getGoodsBuilder() {
        
        onChanged();
        return getGoodsFieldBuilder().getBuilder();
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
        if (goodsBuilder_ != null) {
          return goodsBuilder_.getMessageOrBuilder();
        } else {
          return goods_ == null ?
              ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
        }
      }
      /**
       * <code>.ShopGoods goods = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> 
          getGoodsFieldBuilder() {
        if (goodsBuilder_ == null) {
          goodsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder>(
                  getGoods(),
                  getParentForChildren(),
                  isClean());
          goods_ = null;
        }
        return goodsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BuyGoodsReq)
    }

    // @@protoc_insertion_point(class_scope:BuyGoodsReq)
    private static final BuyGoodsReqOuterClass.BuyGoodsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BuyGoodsReqOuterClass.BuyGoodsReq();
    }

    public static BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuyGoodsReq>
        PARSER = new com.google.protobuf.AbstractParser<BuyGoodsReq>() {
      @java.lang.Override
      public BuyGoodsReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuyGoodsReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BuyGoodsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuyGoodsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuyGoodsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuyGoodsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BuyGoodsReq.proto\032\017ShopGoods.proto\"\256\001\n" +
      "\013BuyGoodsReq\022\020\n\010buyCount\030\016 \001(\r\022\020\n\010shopTy" +
      "pe\030\005 \001(\r\022\031\n\005goods\030\003 \001(\0132\n.ShopGoods\"`\n\013E" +
      "LOCMPDKODO\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\223\006\022\017" +
      "\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJI" +
      "ABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ShopGoodsOuterClass.getDescriptor(),
        });
    internal_static_BuyGoodsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuyGoodsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuyGoodsReq_descriptor,
        new java.lang.String[] { "BuyCount", "ShopType", "Goods", });
    ShopGoodsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
