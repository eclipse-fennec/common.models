/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs;


import org.dmtf.cim.CimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.dmtf.prs.PrsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Cim' basePackage='org.dmtf' complianceLevel='21.0' oSGiCompatible='true' adapterFactory='false' copyrightText='Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation'"
 * @generated
 */
@ProviderType
@EPackage(uri = PrsPackage.eNS_URI, fingerprint = "fp1:e250617afdc0a3acf06ca8136ea45fac9398c8399442eb0bafc33d906f19fe1a", genModel = "/model/cim.genmodel", genModelSourceLocations = {"model/cim.genmodel","org.dmtf.cim.model/model/cim.genmodel"}, ecore = "/model/prs.ecore", ecoreSourceLocations = "/model/prs.ecore")
public interface PrsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/model/dmtf/prs/2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrsPackage eINSTANCE = org.dmtf.prs.impl.PrsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ExchangeElementImpl <em>PRS Exchange Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ExchangeElementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExchangeElement()
	 * @generated
	 */
	int PRS_EXCHANGE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__INSTANCE_ID = CimPackage.CIM_MANAGED_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__CAPTION = CimPackage.CIM_MANAGED_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__DESCRIPTION = CimPackage.CIM_MANAGED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__ELEMENT_NAME = CimPackage.CIM_MANAGED_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__GENERATION = CimPackage.CIM_MANAGED_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME = CimPackage.CIM_MANAGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT__DIRTY_FLAG = CimPackage.CIM_MANAGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT_FEATURE_COUNT = CimPackage.CIM_MANAGED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXCHANGE_ELEMENT_OPERATION_COUNT = CimPackage.CIM_MANAGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ExpressionElementImpl <em>PRS Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ExpressionElementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExpressionElement()
	 * @generated
	 */
	int PRS_EXPRESSION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The number of structural features of the '<em>PRS Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_ELEMENT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_FeatureImpl <em>PRS Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_FeatureImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Feature()
	 * @generated
	 */
	int PRS_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__PROMPT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__VALID_VALUES = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE__DATA_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PRS Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PRS Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_LocationImpl <em>PRS Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_LocationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Location()
	 * @generated
	 */
	int PRS_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__LOCATION_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION__LOCATION_ID = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_LOCATION_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ProductImpl <em>PRS Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ProductImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Product()
	 * @generated
	 */
	int PRS_PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__INSTANCE_ID = PRS_EXPRESSION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__CAPTION = PRS_EXPRESSION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__DESCRIPTION = PRS_EXPRESSION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__ELEMENT_NAME = PRS_EXPRESSION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__GENERATION = PRS_EXPRESSION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__PRS_UNIQUE_NAME = PRS_EXPRESSION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__DIRTY_FLAG = PRS_EXPRESSION_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__VENDOR = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__PRODUCT_NAME = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__VERSION = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT__ORDER = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PRS Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_FEATURE_COUNT = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PRS Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_OPERATION_COUNT = PRS_EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ResourceImpl <em>PRS Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ResourceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Resource()
	 * @generated
	 */
	int PRS_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__RESOURCE_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__QUANTITY = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE__UNITS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PRS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PRS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOURCE_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_RevisionImpl <em>PRS Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_RevisionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Revision()
	 * @generated
	 */
	int PRS_REVISION = 6;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__REVISION_DATE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__ACTIVITY_NAME = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__ACTIVITY_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technical Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__TECHNICAL_STATUS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editorial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION__EDITORIAL_STATUS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PRS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>PRS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl <em>PRS Service Incident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceIncidentImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceIncident()
	 * @generated
	 */
	int PRS_SERVICE_INCIDENT = 7;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Requester ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__REQUESTER_ID = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__PROVIDER_ID = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__CURRENT_STATE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requester Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__RESPONSE_TIME = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Workflow Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__WORKFLOW_STATUS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__COMMENT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Entitled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__ENTITLED = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Acknowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__ACKNOWLEDGE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transaction Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__TRANSACTION_NAME = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT__LAST_TRANSACTION = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>PRS Service Incident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>PRS Service Incident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_INCIDENT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionImpl <em>PRS Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Solution()
	 * @generated
	 */
	int PRS_SOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__TITLE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__SOLUTION_ABSTRACT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION__SOLUTION_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PRS Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PRS Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionElementImpl <em>PRS Solution Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionElementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionElement()
	 * @generated
	 */
	int PRS_SOLUTION_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The number of structural features of the '<em>PRS Solution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_ELEMENT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_StatementImpl <em>PRS Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_StatementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Statement()
	 * @generated
	 */
	int PRS_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__INSTANCE_ID = PRS_EXPRESSION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__CAPTION = PRS_EXPRESSION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__DESCRIPTION = PRS_EXPRESSION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__ELEMENT_NAME = PRS_EXPRESSION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__GENERATION = PRS_EXPRESSION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__PRS_UNIQUE_NAME = PRS_EXPRESSION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__DIRTY_FLAG = PRS_EXPRESSION_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Statement Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__STATEMENT_ROLE = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__TEXT = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__STATEMENT_OPERATOR = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__FEATURE_VALUE = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__ORDER = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relevance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT__RELEVANCE = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PRS Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_FEATURE_COUNT = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PRS Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_OPERATION_COUNT = PRS_EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_TransactionImpl <em>PRS Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_TransactionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Transaction()
	 * @generated
	 */
	int PRS_TRANSACTION = 11;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__TRANSACTION_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__TRANSACTION_STATE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION__COMPLETION_STATUS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PRS Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PRS Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_TRANSACTION_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ActivityImpl <em>PRS Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ActivityImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Activity()
	 * @generated
	 */
	int PRS_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__PARAMETER_LIST = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__NEW_KEYS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__DELETED = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__MODIFIED = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__LOCAL_DATE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY__ACTION_LOG = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PRS Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PRS Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ActivityResourceImpl <em>PRS Activity Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ActivityResourceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityResource()
	 * @generated
	 */
	int PRS_ACTIVITY_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_RESOURCE__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_RESOURCE__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Activity Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_RESOURCE_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Activity Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_RESOURCE_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ActivityTransactionImpl <em>PRS Activity Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ActivityTransactionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityTransaction()
	 * @generated
	 */
	int PRS_ACTIVITY_TRANSACTION = 14;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_TRANSACTION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_TRANSACTION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Activity Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_TRANSACTION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Activity Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_TRANSACTION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AddressImpl <em>PRS Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AddressImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Address()
	 * @generated
	 */
	int PRS_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ADDRESS_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ADDRESS1 = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ADDRESS2 = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ADDRESS3 = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Address4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__ADDRESS4 = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__CITY = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__REGION = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__POSTAL_CODE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__TIME_ZONE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS__COUNTRY = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>PRS Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>PRS Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AddressLocationImpl <em>PRS Address Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AddressLocationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AddressLocation()
	 * @generated
	 */
	int PRS_ADDRESS_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_LOCATION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_LOCATION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_LOCATION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADDRESS_LOCATION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AdministrativeImpl <em>PRS Administrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AdministrativeImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Administrative()
	 * @generated
	 */
	int PRS_ADMINISTRATIVE = 17;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__DOCUMENT_STATUS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__DISTRIBUTION = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__LANGUAGE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__COPYRIGHT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disclaimer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__DISCLAIMER = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE__RIGHTS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PRS Administrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PRS Administrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AdministrativeRevisionImpl <em>PRS Administrative Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AdministrativeRevisionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdministrativeRevision()
	 * @generated
	 */
	int PRS_ADMINISTRATIVE_REVISION = 18;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_REVISION__ANTECEDENT = CimPackage.CIM_HOSTED_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_REVISION__DEPENDENT = CimPackage.CIM_HOSTED_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Administrative Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_REVISION_FEATURE_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Administrative Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_REVISION_OPERATION_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AgreementImpl <em>PRS Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AgreementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Agreement()
	 * @generated
	 */
	int PRS_AGREEMENT = 19;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Contract ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__CONTRACT_ID = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agreement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT__AGREEMENT_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_AGREEMENT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AttachmentImpl <em>PRS Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AttachmentImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Attachment()
	 * @generated
	 */
	int PRS_ATTACHMENT = 20;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Attachment Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ATTACHMENT_REFERENCE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__PROTOCOL = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__FORMAT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attachment Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ATTACHMENT_SIZE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ATTACHMENT_OBJECT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attachment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ATTACHMENT_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT__ATTACHMENT_NAME = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PRS Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PRS Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHMENT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_CategoryImpl <em>PRS Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_CategoryImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Category()
	 * @generated
	 */
	int PRS_CATEGORY = 21;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Category Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__CATEGORY_CONTENTS = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY__CATEGORY_TYPE = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_CategoryParentChildImpl <em>PRS Category Parent Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_CategoryParentChildImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_CategoryParentChild()
	 * @generated
	 */
	int PRS_CATEGORY_PARENT_CHILD = 22;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_PARENT_CHILD__ANTECEDENT = CimPackage.CIM_HOSTED_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_PARENT_CHILD__DEPENDENT = CimPackage.CIM_HOSTED_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Category Parent Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_PARENT_CHILD_FEATURE_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Category Parent Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORY_PARENT_CHILD_OPERATION_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactImpl <em>PRS Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Contact()
	 * @generated
	 */
	int PRS_CONTACT = 23;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The number of structural features of the '<em>PRS Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactItemImpl <em>PRS Contact Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactItemImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactItem()
	 * @generated
	 */
	int PRS_CONTACT_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__INSTANCE_ID = PRS_EXCHANGE_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__CAPTION = PRS_EXCHANGE_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__DESCRIPTION = PRS_EXCHANGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__ELEMENT_NAME = PRS_EXCHANGE_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__GENERATION = PRS_EXCHANGE_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__PRS_UNIQUE_NAME = PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM__DIRTY_FLAG = PRS_EXCHANGE_ELEMENT__DIRTY_FLAG;

	/**
	 * The number of structural features of the '<em>PRS Contact Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_FEATURE_COUNT = PRS_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_OPERATION_COUNT = PRS_EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactItemAddressImpl <em>PRS Contact Item Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactItemAddressImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactItemAddress()
	 * @generated
	 */
	int PRS_CONTACT_ITEM_ADDRESS = 25;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_ADDRESS__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_ADDRESS__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Contact Item Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_ADDRESS_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact Item Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ITEM_ADDRESS_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ExpressionImpl <em>PRS Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ExpressionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Expression()
	 * @generated
	 */
	int PRS_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__INSTANCE_ID = PRS_EXPRESSION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__CAPTION = PRS_EXPRESSION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__DESCRIPTION = PRS_EXPRESSION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__ELEMENT_NAME = PRS_EXPRESSION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__GENERATION = PRS_EXPRESSION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__PRS_UNIQUE_NAME = PRS_EXPRESSION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__DIRTY_FLAG = PRS_EXPRESSION_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION__RELATION = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRS Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_FEATURE_COUNT = PRS_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PRS Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_OPERATION_COUNT = PRS_EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ExpressionLinkImpl <em>PRS Expression Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ExpressionLinkImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExpressionLink()
	 * @generated
	 */
	int PRS_EXPRESSION_LINK = 27;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_LINK__ANTECEDENT = CimPackage.CIM_HOSTED_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_LINK__DEPENDENT = CimPackage.CIM_HOSTED_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Expression Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_LINK_FEATURE_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Expression Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_EXPRESSION_LINK_OPERATION_COUNT = CimPackage.CIM_HOSTED_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_FeatureResourceImpl <em>PRS Feature Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_FeatureResourceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_FeatureResource()
	 * @generated
	 */
	int PRS_FEATURE_RESOURCE = 28;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_RESOURCE__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_RESOURCE__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Feature Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_RESOURCE_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Feature Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_FEATURE_RESOURCE_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_OrganizationImpl <em>PRS Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_OrganizationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Organization()
	 * @generated
	 */
	int PRS_ORGANIZATION = 29;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__INSTANCE_ID = PRS_CONTACT_ITEM__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__CAPTION = PRS_CONTACT_ITEM__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__DESCRIPTION = PRS_CONTACT_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__ELEMENT_NAME = PRS_CONTACT_ITEM__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__GENERATION = PRS_CONTACT_ITEM__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__PRS_UNIQUE_NAME = PRS_CONTACT_ITEM__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__DIRTY_FLAG = PRS_CONTACT_ITEM__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__NAME = PRS_CONTACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION__BUSINESS = PRS_CONTACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION_FEATURE_COUNT = PRS_CONTACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ORGANIZATION_OPERATION_COUNT = PRS_CONTACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_PersonImpl <em>PRS Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_PersonImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Person()
	 * @generated
	 */
	int PRS_PERSON = 30;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__INSTANCE_ID = PRS_CONTACT_ITEM__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__CAPTION = PRS_CONTACT_ITEM__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__DESCRIPTION = PRS_CONTACT_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__ELEMENT_NAME = PRS_CONTACT_ITEM__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__GENERATION = PRS_CONTACT_ITEM__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__PRS_UNIQUE_NAME = PRS_CONTACT_ITEM__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__DIRTY_FLAG = PRS_CONTACT_ITEM__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__FIRST_NAME = PRS_CONTACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__LAST_NAME = PRS_CONTACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__SALUTATION = PRS_CONTACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__TITLE = PRS_CONTACT_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__CONTACT_TYPE = PRS_CONTACT_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON__COMMUNICATION_MODE = PRS_CONTACT_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PRS Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON_FEATURE_COUNT = PRS_CONTACT_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PRS Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PERSON_OPERATION_COUNT = PRS_CONTACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ProblemImpl <em>PRS Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ProblemImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Problem()
	 * @generated
	 */
	int PRS_PROBLEM = 31;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__INSTANCE_ID = PRS_SOLUTION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__CAPTION = PRS_SOLUTION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__DESCRIPTION = PRS_SOLUTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__ELEMENT_NAME = PRS_SOLUTION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__GENERATION = PRS_SOLUTION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__PRS_UNIQUE_NAME = PRS_SOLUTION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__DIRTY_FLAG = PRS_SOLUTION_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__LIKELIHOOD = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM__IMPACT = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRS Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM_FEATURE_COUNT = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PROBLEM_OPERATION_COUNT = PRS_SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ProductAssetImpl <em>PRS Product Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ProductAssetImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductAsset()
	 * @generated
	 */
	int PRS_PRODUCT_ASSET = 32;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_ASSET__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_ASSET__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Product Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_ASSET_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Product Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_ASSET_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ProductComponentImpl <em>PRS Product Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ProductComponentImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductComponent()
	 * @generated
	 */
	int PRS_PRODUCT_COMPONENT = 33;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_COMPONENT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_COMPONENT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Product Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_COMPONENT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Product Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_COMPONENT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ProductParentChildImpl <em>PRS Product Parent Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ProductParentChildImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductParentChild()
	 * @generated
	 */
	int PRS_PRODUCT_PARENT_CHILD = 34;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_PARENT_CHILD__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_PARENT_CHILD__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Product Parent Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_PARENT_CHILD_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Product Parent Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_PRODUCT_PARENT_CHILD_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ReferenceImpl <em>PRS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ReferenceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Reference()
	 * @generated
	 */
	int PRS_REFERENCE = 35;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__INSTANCE_ID = PRS_SOLUTION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__CAPTION = PRS_SOLUTION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__DESCRIPTION = PRS_SOLUTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__ELEMENT_NAME = PRS_SOLUTION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__GENERATION = PRS_SOLUTION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__PRS_UNIQUE_NAME = PRS_SOLUTION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE__DIRTY_FLAG = PRS_SOLUTION_ELEMENT__DIRTY_FLAG;

	/**
	 * The number of structural features of the '<em>PRS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE_FEATURE_COUNT = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REFERENCE_OPERATION_COUNT = PRS_SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ResolutionImpl <em>PRS Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ResolutionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Resolution()
	 * @generated
	 */
	int PRS_RESOLUTION = 36;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__INSTANCE_ID = PRS_SOLUTION_ELEMENT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__CAPTION = PRS_SOLUTION_ELEMENT__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__DESCRIPTION = PRS_SOLUTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__ELEMENT_NAME = PRS_SOLUTION_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__GENERATION = PRS_SOLUTION_ELEMENT__GENERATION;

	/**
	 * The feature id for the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__PRS_UNIQUE_NAME = PRS_SOLUTION_ELEMENT__PRS_UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__DIRTY_FLAG = PRS_SOLUTION_ELEMENT__DIRTY_FLAG;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION__CONFIDENCE = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRS Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_FEATURE_COUNT = PRS_SOLUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PRS Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_OPERATION_COUNT = PRS_SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ResolutionResourceImpl <em>PRS Resolution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ResolutionResourceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ResolutionResource()
	 * @generated
	 */
	int PRS_RESOLUTION_RESOURCE = 37;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_RESOURCE__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_RESOURCE__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Resolution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_RESOURCE_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Resolution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_RESOLUTION_RESOURCE_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_RevisionContactImpl <em>PRS Revision Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_RevisionContactImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_RevisionContact()
	 * @generated
	 */
	int PRS_REVISION_CONTACT = 38;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_CONTACT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_CONTACT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Revision Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_CONTACT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Revision Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_REVISION_CONTACT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceActivityImpl <em>PRS Service Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceActivityImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceActivity()
	 * @generated
	 */
	int PRS_SERVICE_ACTIVITY = 39;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_ACTIVITY__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_ACTIVITY__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_ACTIVITY_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_ACTIVITY_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceAgreementImpl <em>PRS Service Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceAgreementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceAgreement()
	 * @generated
	 */
	int PRS_SERVICE_AGREEMENT = 40;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_AGREEMENT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_AGREEMENT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_AGREEMENT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_AGREEMENT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceProblemImpl <em>PRS Service Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceProblemImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceProblem()
	 * @generated
	 */
	int PRS_SERVICE_PROBLEM = 41;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROBLEM__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROBLEM__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROBLEM_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROBLEM_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceProviderImpl <em>PRS Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceProviderImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceProvider()
	 * @generated
	 */
	int PRS_SERVICE_PROVIDER = 42;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROVIDER__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROVIDER__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROVIDER_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_PROVIDER_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceRequesterImpl <em>PRS Service Requester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceRequesterImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceRequester()
	 * @generated
	 */
	int PRS_SERVICE_REQUESTER = 43;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_REQUESTER__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_REQUESTER__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Requester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_REQUESTER_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Requester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_REQUESTER_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ServiceResolutionSolutionImpl <em>PRS Service Resolution Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ServiceResolutionSolutionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceResolutionSolution()
	 * @generated
	 */
	int PRS_SERVICE_RESOLUTION_SOLUTION = 44;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_RESOLUTION_SOLUTION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_RESOLUTION_SOLUTION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Service Resolution Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_RESOLUTION_SOLUTION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Service Resolution Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SERVICE_RESOLUTION_SOLUTION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionCategoryImpl <em>PRS Solution Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionCategoryImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionCategory()
	 * @generated
	 */
	int PRS_SOLUTION_CATEGORY = 45;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_CATEGORY__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_CATEGORY__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_CATEGORY_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_CATEGORY_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionExpressionImpl <em>PRS Solution Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionExpressionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionExpression()
	 * @generated
	 */
	int PRS_SOLUTION_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_EXPRESSION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_EXPRESSION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_EXPRESSION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_EXPRESSION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionHasElementImpl <em>PRS Solution Has Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionHasElementImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionHasElement()
	 * @generated
	 */
	int PRS_SOLUTION_HAS_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_HAS_ELEMENT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_HAS_ELEMENT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Has Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_HAS_ELEMENT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Has Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_HAS_ELEMENT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionProblemImpl <em>PRS Solution Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionProblemImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionProblem()
	 * @generated
	 */
	int PRS_SOLUTION_PROBLEM = 48;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_PROBLEM__ANTECEDENT = PRS_SOLUTION_HAS_ELEMENT__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_PROBLEM__DEPENDENT = PRS_SOLUTION_HAS_ELEMENT__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_PROBLEM_FEATURE_COUNT = PRS_SOLUTION_HAS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_PROBLEM_OPERATION_COUNT = PRS_SOLUTION_HAS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionReferenceImpl <em>PRS Solution Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionReferenceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionReference()
	 * @generated
	 */
	int PRS_SOLUTION_REFERENCE = 49;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_REFERENCE__ANTECEDENT = PRS_SOLUTION_HAS_ELEMENT__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_REFERENCE__DEPENDENT = PRS_SOLUTION_HAS_ELEMENT__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_REFERENCE_FEATURE_COUNT = PRS_SOLUTION_HAS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_REFERENCE_OPERATION_COUNT = PRS_SOLUTION_HAS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SolutionResolutionImpl <em>PRS Solution Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SolutionResolutionImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionResolution()
	 * @generated
	 */
	int PRS_SOLUTION_RESOLUTION = 50;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_RESOLUTION__ANTECEDENT = PRS_SOLUTION_HAS_ELEMENT__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_RESOLUTION__DEPENDENT = PRS_SOLUTION_HAS_ELEMENT__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Solution Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_RESOLUTION_FEATURE_COUNT = PRS_SOLUTION_HAS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Solution Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SOLUTION_RESOLUTION_OPERATION_COUNT = PRS_SOLUTION_HAS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_StatementFeatureImpl <em>PRS Statement Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_StatementFeatureImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_StatementFeature()
	 * @generated
	 */
	int PRS_STATEMENT_FEATURE = 51;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_FEATURE__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_FEATURE__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Statement Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_FEATURE_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Statement Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_STATEMENT_FEATURE_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ActivityContactImpl <em>PRS Activity Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ActivityContactImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityContact()
	 * @generated
	 */
	int PRS_ACTIVITY_CONTACT = 52;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_CONTACT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_CONTACT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Activity Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_CONTACT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Activity Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ACTIVITY_CONTACT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AdminAssociationImpl <em>PRS Admin Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AdminAssociationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdminAssociation()
	 * @generated
	 */
	int PRS_ADMIN_ASSOCIATION = 53;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMIN_ASSOCIATION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMIN_ASSOCIATION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Admin Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMIN_ASSOCIATION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Admin Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMIN_ASSOCIATION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AdministrativeContactImpl <em>PRS Administrative Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AdministrativeContactImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdministrativeContact()
	 * @generated
	 */
	int PRS_ADMINISTRATIVE_CONTACT = 54;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_CONTACT__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_CONTACT__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Administrative Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_CONTACT_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Administrative Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ADMINISTRATIVE_CONTACT_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_AttachedImpl <em>PRS Attached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_AttachedImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Attached()
	 * @generated
	 */
	int PRS_ATTACHED = 55;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHED__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHED__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Attached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHED_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Attached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_ATTACHED_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_CategorizationImpl <em>PRS Categorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_CategorizationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Categorization()
	 * @generated
	 */
	int PRS_CATEGORIZATION = 56;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORIZATION__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORIZATION__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Categorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORIZATION_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Categorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CATEGORIZATION_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactContactItemImpl <em>PRS Contact Contact Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactContactItemImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactContactItem()
	 * @generated
	 */
	int PRS_CONTACT_CONTACT_ITEM = 57;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_CONTACT_ITEM__ANTECEDENT = CimPackage.CIM_DEPENDENCY__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_CONTACT_ITEM__DEPENDENT = CimPackage.CIM_DEPENDENCY__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Contact Contact Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_CONTACT_ITEM_FEATURE_COUNT = CimPackage.CIM_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact Contact Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_CONTACT_ITEM_OPERATION_COUNT = CimPackage.CIM_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactOrganizationImpl <em>PRS Contact Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactOrganizationImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactOrganization()
	 * @generated
	 */
	int PRS_CONTACT_ORGANIZATION = 58;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ORGANIZATION__ANTECEDENT = PRS_CONTACT_CONTACT_ITEM__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ORGANIZATION__DEPENDENT = PRS_CONTACT_CONTACT_ITEM__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Contact Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ORGANIZATION_FEATURE_COUNT = PRS_CONTACT_CONTACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_ORGANIZATION_OPERATION_COUNT = PRS_CONTACT_CONTACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_ContactPersonImpl <em>PRS Contact Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_ContactPersonImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactPerson()
	 * @generated
	 */
	int PRS_CONTACT_PERSON = 59;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_PERSON__ANTECEDENT = PRS_CONTACT_CONTACT_ITEM__ANTECEDENT;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_PERSON__DEPENDENT = PRS_CONTACT_CONTACT_ITEM__DEPENDENT;

	/**
	 * The number of structural features of the '<em>PRS Contact Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_PERSON_FEATURE_COUNT = PRS_CONTACT_CONTACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRS Contact Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_CONTACT_PERSON_OPERATION_COUNT = PRS_CONTACT_CONTACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dmtf.prs.impl.PRS_SISServiceImpl <em>PRS SIS Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dmtf.prs.impl.PRS_SISServiceImpl
	 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SISService()
	 * @generated
	 */
	int PRS_SIS_SERVICE = 60;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__INSTANCE_ID = CimPackage.CIM_SERVICE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__CAPTION = CimPackage.CIM_SERVICE__CAPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__DESCRIPTION = CimPackage.CIM_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__ELEMENT_NAME = CimPackage.CIM_SERVICE__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__GENERATION = CimPackage.CIM_SERVICE__GENERATION;

	/**
	 * The feature id for the '<em><b>Install Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__INSTALL_DATE = CimPackage.CIM_SERVICE__INSTALL_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__NAME = CimPackage.CIM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Operational Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__OPERATIONAL_STATUS = CimPackage.CIM_SERVICE__OPERATIONAL_STATUS;

	/**
	 * The feature id for the '<em><b>Status Descriptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__STATUS_DESCRIPTIONS = CimPackage.CIM_SERVICE__STATUS_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__STATUS = CimPackage.CIM_SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Health State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__HEALTH_STATE = CimPackage.CIM_SERVICE__HEALTH_STATE;

	/**
	 * The feature id for the '<em><b>Communication Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__COMMUNICATION_STATUS = CimPackage.CIM_SERVICE__COMMUNICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Detailed Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__DETAILED_STATUS = CimPackage.CIM_SERVICE__DETAILED_STATUS;

	/**
	 * The feature id for the '<em><b>Operating Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__OPERATING_STATUS = CimPackage.CIM_SERVICE__OPERATING_STATUS;

	/**
	 * The feature id for the '<em><b>Primary Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__PRIMARY_STATUS = CimPackage.CIM_SERVICE__PRIMARY_STATUS;

	/**
	 * The feature id for the '<em><b>Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__ENABLED_STATE = CimPackage.CIM_SERVICE__ENABLED_STATE;

	/**
	 * The feature id for the '<em><b>Other Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__OTHER_ENABLED_STATE = CimPackage.CIM_SERVICE__OTHER_ENABLED_STATE;

	/**
	 * The feature id for the '<em><b>Requested State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__REQUESTED_STATE = CimPackage.CIM_SERVICE__REQUESTED_STATE;

	/**
	 * The feature id for the '<em><b>Enabled Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__ENABLED_DEFAULT = CimPackage.CIM_SERVICE__ENABLED_DEFAULT;

	/**
	 * The feature id for the '<em><b>Time Of Last State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__TIME_OF_LAST_STATE_CHANGE = CimPackage.CIM_SERVICE__TIME_OF_LAST_STATE_CHANGE;

	/**
	 * The feature id for the '<em><b>Available Requested States</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__AVAILABLE_REQUESTED_STATES = CimPackage.CIM_SERVICE__AVAILABLE_REQUESTED_STATES;

	/**
	 * The feature id for the '<em><b>Transitioning To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__TRANSITIONING_TO_STATE = CimPackage.CIM_SERVICE__TRANSITIONING_TO_STATE;

	/**
	 * The feature id for the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__SYSTEM_CREATION_CLASS_NAME = CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__SYSTEM_NAME = CimPackage.CIM_SERVICE__SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__CREATION_CLASS_NAME = CimPackage.CIM_SERVICE__CREATION_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Primary Owner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__PRIMARY_OWNER_NAME = CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME;

	/**
	 * The feature id for the '<em><b>Primary Owner Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__PRIMARY_OWNER_CONTACT = CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT;

	/**
	 * The feature id for the '<em><b>Start Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__START_MODE = CimPackage.CIM_SERVICE__START_MODE;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__STARTED = CimPackage.CIM_SERVICE__STARTED;

	/**
	 * The feature id for the '<em><b>Lo SID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__LO_SID = CimPackage.CIM_SERVICE__LO_SID;

	/**
	 * The feature id for the '<em><b>Lo SOrg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE__LO_SORG_ID = CimPackage.CIM_SERVICE__LO_SORG_ID;

	/**
	 * The number of structural features of the '<em>PRS SIS Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE_FEATURE_COUNT = CimPackage.CIM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Request State Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___REQUEST_STATE_CHANGE__INTEGER_CIM_CONCRETEJOB_STRING = CimPackage.CIM_SERVICE___REQUEST_STATE_CHANGE__INTEGER_CIM_CONCRETEJOB_STRING;

	/**
	 * The operation id for the '<em>Start Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___START_SERVICE = CimPackage.CIM_SERVICE___START_SERVICE;

	/**
	 * The operation id for the '<em>Stop Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___STOP_SERVICE = CimPackage.CIM_SERVICE___STOP_SERVICE;

	/**
	 * The operation id for the '<em>Change Affected Elements Assigned Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___CHANGE_AFFECTED_ELEMENTS_ASSIGNED_SEQUENCE__ELIST_ELIST_CIM_CONCRETEJOB = CimPackage.CIM_SERVICE___CHANGE_AFFECTED_ELEMENTS_ASSIGNED_SEQUENCE__ELIST_ELIST_CIM_CONCRETEJOB;

	/**
	 * The operation id for the '<em>Start SIS Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___START_SIS_TRANSACTION__INTEGER_PRS_ACTIVITY_PRS_TRANSACTION = CimPackage.CIM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>End SIS Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___END_SIS_TRANSACTION__LONG_PRS_TRANSACTION = CimPackage.CIM_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set SIS Completion Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE___SET_SIS_COMPLETION_STATUS__LONG_PRS_TRANSACTION = CimPackage.CIM_SERVICE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRS SIS Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRS_SIS_SERVICE_OPERATION_COUNT = CimPackage.CIM_SERVICE_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ExchangeElement <em>PRS Exchange Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Exchange Element</em>'.
	 * @see org.dmtf.prs.PRS_ExchangeElement
	 * @generated
	 */
	EClass getPRS_ExchangeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ExchangeElement#getPRSUniqueName <em>PRS Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRS Unique Name</em>'.
	 * @see org.dmtf.prs.PRS_ExchangeElement#getPRSUniqueName()
	 * @see #getPRS_ExchangeElement()
	 * @generated
	 */
	EAttribute getPRS_ExchangeElement_PRSUniqueName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ExchangeElement#getDirtyFlag <em>Dirty Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty Flag</em>'.
	 * @see org.dmtf.prs.PRS_ExchangeElement#getDirtyFlag()
	 * @see #getPRS_ExchangeElement()
	 * @generated
	 */
	EAttribute getPRS_ExchangeElement_DirtyFlag();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ExpressionElement <em>PRS Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Expression Element</em>'.
	 * @see org.dmtf.prs.PRS_ExpressionElement
	 * @generated
	 */
	EClass getPRS_ExpressionElement();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Feature <em>PRS Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Feature</em>'.
	 * @see org.dmtf.prs.PRS_Feature
	 * @generated
	 */
	EClass getPRS_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Feature#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see org.dmtf.prs.PRS_Feature#getPrompt()
	 * @see #getPRS_Feature()
	 * @generated
	 */
	EAttribute getPRS_Feature_Prompt();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Feature#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Values</em>'.
	 * @see org.dmtf.prs.PRS_Feature#getValidValues()
	 * @see #getPRS_Feature()
	 * @generated
	 */
	EAttribute getPRS_Feature_ValidValues();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Feature#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.dmtf.prs.PRS_Feature#getDataType()
	 * @see #getPRS_Feature()
	 * @generated
	 */
	EAttribute getPRS_Feature_DataType();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Location <em>PRS Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Location</em>'.
	 * @see org.dmtf.prs.PRS_Location
	 * @generated
	 */
	EClass getPRS_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Location#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Type</em>'.
	 * @see org.dmtf.prs.PRS_Location#getLocationType()
	 * @see #getPRS_Location()
	 * @generated
	 */
	EAttribute getPRS_Location_LocationType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Location#getLocationID <em>Location ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location ID</em>'.
	 * @see org.dmtf.prs.PRS_Location#getLocationID()
	 * @see #getPRS_Location()
	 * @generated
	 */
	EAttribute getPRS_Location_LocationID();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Product <em>PRS Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Product</em>'.
	 * @see org.dmtf.prs.PRS_Product
	 * @generated
	 */
	EClass getPRS_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Product#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.dmtf.prs.PRS_Product#getVendor()
	 * @see #getPRS_Product()
	 * @generated
	 */
	EAttribute getPRS_Product_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Product#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.dmtf.prs.PRS_Product#getProductName()
	 * @see #getPRS_Product()
	 * @generated
	 */
	EAttribute getPRS_Product_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Product#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.dmtf.prs.PRS_Product#getVersion()
	 * @see #getPRS_Product()
	 * @generated
	 */
	EAttribute getPRS_Product_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Product#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.dmtf.prs.PRS_Product#getOrder()
	 * @see #getPRS_Product()
	 * @generated
	 */
	EAttribute getPRS_Product_Order();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Resource <em>PRS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Resource</em>'.
	 * @see org.dmtf.prs.PRS_Resource
	 * @generated
	 */
	EClass getPRS_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Resource#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.dmtf.prs.PRS_Resource#getResourceType()
	 * @see #getPRS_Resource()
	 * @generated
	 */
	EAttribute getPRS_Resource_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Resource#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.dmtf.prs.PRS_Resource#getQuantity()
	 * @see #getPRS_Resource()
	 * @generated
	 */
	EAttribute getPRS_Resource_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Resource#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.dmtf.prs.PRS_Resource#getUnits()
	 * @see #getPRS_Resource()
	 * @generated
	 */
	EAttribute getPRS_Resource_Units();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Revision <em>PRS Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Revision</em>'.
	 * @see org.dmtf.prs.PRS_Revision
	 * @generated
	 */
	EClass getPRS_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Revision#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see org.dmtf.prs.PRS_Revision#getRevisionDate()
	 * @see #getPRS_Revision()
	 * @generated
	 */
	EAttribute getPRS_Revision_RevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Revision#getActivityName <em>Activity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Name</em>'.
	 * @see org.dmtf.prs.PRS_Revision#getActivityName()
	 * @see #getPRS_Revision()
	 * @generated
	 */
	EAttribute getPRS_Revision_ActivityName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Revision#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see org.dmtf.prs.PRS_Revision#getActivityType()
	 * @see #getPRS_Revision()
	 * @generated
	 */
	EAttribute getPRS_Revision_ActivityType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Revision#getTechnicalStatus <em>Technical Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Status</em>'.
	 * @see org.dmtf.prs.PRS_Revision#getTechnicalStatus()
	 * @see #getPRS_Revision()
	 * @generated
	 */
	EAttribute getPRS_Revision_TechnicalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Revision#getEditorialStatus <em>Editorial Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editorial Status</em>'.
	 * @see org.dmtf.prs.PRS_Revision#getEditorialStatus()
	 * @see #getPRS_Revision()
	 * @generated
	 */
	EAttribute getPRS_Revision_EditorialStatus();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceIncident <em>PRS Service Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Incident</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident
	 * @generated
	 */
	EClass getPRS_ServiceIncident();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterID <em>Requester ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requester ID</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getRequesterID()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_RequesterID();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getProviderID <em>Provider ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider ID</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getProviderID()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_ProviderID();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getCurrentState()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterSeverity <em>Requester Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requester Severity</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getRequesterSeverity()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_RequesterSeverity();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getProviderPriority <em>Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Priority</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getProviderPriority()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_ProviderPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getResponseTime()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getWorkflowStatus <em>Workflow Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workflow Status</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getWorkflowStatus()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_WorkflowStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getComment()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getEntitled <em>Entitled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entitled</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getEntitled()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_Entitled();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getAcknowledge <em>Acknowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledge</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getAcknowledge()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_Acknowledge();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getTransactionName <em>Transaction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Name</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getTransactionName()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_TransactionName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_ServiceIncident#getLastTransaction <em>Last Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Transaction</em>'.
	 * @see org.dmtf.prs.PRS_ServiceIncident#getLastTransaction()
	 * @see #getPRS_ServiceIncident()
	 * @generated
	 */
	EAttribute getPRS_ServiceIncident_LastTransaction();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Solution <em>PRS Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution</em>'.
	 * @see org.dmtf.prs.PRS_Solution
	 * @generated
	 */
	EClass getPRS_Solution();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Solution#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.dmtf.prs.PRS_Solution#getTitle()
	 * @see #getPRS_Solution()
	 * @generated
	 */
	EAttribute getPRS_Solution_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Solution#getSolutionAbstract <em>Solution Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Abstract</em>'.
	 * @see org.dmtf.prs.PRS_Solution#getSolutionAbstract()
	 * @see #getPRS_Solution()
	 * @generated
	 */
	EAttribute getPRS_Solution_SolutionAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Solution#getSolutionType <em>Solution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Type</em>'.
	 * @see org.dmtf.prs.PRS_Solution#getSolutionType()
	 * @see #getPRS_Solution()
	 * @generated
	 */
	EAttribute getPRS_Solution_SolutionType();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionElement <em>PRS Solution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Element</em>'.
	 * @see org.dmtf.prs.PRS_SolutionElement
	 * @generated
	 */
	EClass getPRS_SolutionElement();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Statement <em>PRS Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Statement</em>'.
	 * @see org.dmtf.prs.PRS_Statement
	 * @generated
	 */
	EClass getPRS_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getStatementRole <em>Statement Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Role</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getStatementRole()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_StatementRole();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getText()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getStatementOperator <em>Statement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Operator</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getStatementOperator()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_StatementOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getFeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Value</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getFeatureValue()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_FeatureValue();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getOrder()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Statement#getRelevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevance</em>'.
	 * @see org.dmtf.prs.PRS_Statement#getRelevance()
	 * @see #getPRS_Statement()
	 * @generated
	 */
	EAttribute getPRS_Statement_Relevance();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Transaction <em>PRS Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Transaction</em>'.
	 * @see org.dmtf.prs.PRS_Transaction
	 * @generated
	 */
	EClass getPRS_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Transaction#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see org.dmtf.prs.PRS_Transaction#getTransactionType()
	 * @see #getPRS_Transaction()
	 * @generated
	 */
	EAttribute getPRS_Transaction_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Transaction#getTransactionState <em>Transaction State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction State</em>'.
	 * @see org.dmtf.prs.PRS_Transaction#getTransactionState()
	 * @see #getPRS_Transaction()
	 * @generated
	 */
	EAttribute getPRS_Transaction_TransactionState();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Transaction#getCompletionStatus <em>Completion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Status</em>'.
	 * @see org.dmtf.prs.PRS_Transaction#getCompletionStatus()
	 * @see #getPRS_Transaction()
	 * @generated
	 */
	EAttribute getPRS_Transaction_CompletionStatus();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Activity <em>PRS Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Activity</em>'.
	 * @see org.dmtf.prs.PRS_Activity
	 * @generated
	 */
	EClass getPRS_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter List</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getParameterList()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_ParameterList();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getNewKeys <em>New Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keys</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getNewKeys()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_NewKeys();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getDeleted()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_Deleted();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getModified()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getLocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Date</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getLocalDate()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_LocalDate();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Activity#getActionLog <em>Action Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Log</em>'.
	 * @see org.dmtf.prs.PRS_Activity#getActionLog()
	 * @see #getPRS_Activity()
	 * @generated
	 */
	EAttribute getPRS_Activity_ActionLog();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ActivityResource <em>PRS Activity Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Activity Resource</em>'.
	 * @see org.dmtf.prs.PRS_ActivityResource
	 * @generated
	 */
	EClass getPRS_ActivityResource();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ActivityTransaction <em>PRS Activity Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Activity Transaction</em>'.
	 * @see org.dmtf.prs.PRS_ActivityTransaction
	 * @generated
	 */
	EClass getPRS_ActivityTransaction();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Address <em>PRS Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Address</em>'.
	 * @see org.dmtf.prs.PRS_Address
	 * @generated
	 */
	EClass getPRS_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see org.dmtf.prs.PRS_Address#getAddressType()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_AddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see org.dmtf.prs.PRS_Address#getAddress1()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Address1();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see org.dmtf.prs.PRS_Address#getAddress2()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Address2();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getAddress3 <em>Address3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address3</em>'.
	 * @see org.dmtf.prs.PRS_Address#getAddress3()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Address3();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getAddress4 <em>Address4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address4</em>'.
	 * @see org.dmtf.prs.PRS_Address#getAddress4()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Address4();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.dmtf.prs.PRS_Address#getCity()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_City();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.dmtf.prs.PRS_Address#getRegion()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.dmtf.prs.PRS_Address#getPostalCode()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see org.dmtf.prs.PRS_Address#getTimeZone()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_TimeZone();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.dmtf.prs.PRS_Address#getCountry()
	 * @see #getPRS_Address()
	 * @generated
	 */
	EAttribute getPRS_Address_Country();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_AddressLocation <em>PRS Address Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Address Location</em>'.
	 * @see org.dmtf.prs.PRS_AddressLocation
	 * @generated
	 */
	EClass getPRS_AddressLocation();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Administrative <em>PRS Administrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Administrative</em>'.
	 * @see org.dmtf.prs.PRS_Administrative
	 * @generated
	 */
	EClass getPRS_Administrative();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getComplianceLevel <em>Compliance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance Level</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getComplianceLevel()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_ComplianceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Status</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getDocumentStatus()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_DocumentStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getDistribution()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getLanguage()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getCopyright()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getDisclaimer <em>Disclaimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disclaimer</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getDisclaimer()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_Disclaimer();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Administrative#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights</em>'.
	 * @see org.dmtf.prs.PRS_Administrative#getRights()
	 * @see #getPRS_Administrative()
	 * @generated
	 */
	EAttribute getPRS_Administrative_Rights();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_AdministrativeRevision <em>PRS Administrative Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Administrative Revision</em>'.
	 * @see org.dmtf.prs.PRS_AdministrativeRevision
	 * @generated
	 */
	EClass getPRS_AdministrativeRevision();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Agreement <em>PRS Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Agreement</em>'.
	 * @see org.dmtf.prs.PRS_Agreement
	 * @generated
	 */
	EClass getPRS_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Agreement#getContractID <em>Contract ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract ID</em>'.
	 * @see org.dmtf.prs.PRS_Agreement#getContractID()
	 * @see #getPRS_Agreement()
	 * @generated
	 */
	EAttribute getPRS_Agreement_ContractID();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Agreement#getAgreementType <em>Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Type</em>'.
	 * @see org.dmtf.prs.PRS_Agreement#getAgreementType()
	 * @see #getPRS_Agreement()
	 * @generated
	 */
	EAttribute getPRS_Agreement_AgreementType();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Attachment <em>PRS Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Attachment</em>'.
	 * @see org.dmtf.prs.PRS_Attachment
	 * @generated
	 */
	EClass getPRS_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getAttachmentReference <em>Attachment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Reference</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getAttachmentReference()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_AttachmentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getProtocol()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getFormat()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getAttachmentSize <em>Attachment Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Size</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getAttachmentSize()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_AttachmentSize();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getAttachmentObject <em>Attachment Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Object</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getAttachmentObject()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_AttachmentObject();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getAttachmentType <em>Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Type</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getAttachmentType()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_AttachmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Attachment#getAttachmentName <em>Attachment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Name</em>'.
	 * @see org.dmtf.prs.PRS_Attachment#getAttachmentName()
	 * @see #getPRS_Attachment()
	 * @generated
	 */
	EAttribute getPRS_Attachment_AttachmentName();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Category <em>PRS Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Category</em>'.
	 * @see org.dmtf.prs.PRS_Category
	 * @generated
	 */
	EClass getPRS_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Category#getCategoryContents <em>Category Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Contents</em>'.
	 * @see org.dmtf.prs.PRS_Category#getCategoryContents()
	 * @see #getPRS_Category()
	 * @generated
	 */
	EAttribute getPRS_Category_CategoryContents();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Category#getCategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Type</em>'.
	 * @see org.dmtf.prs.PRS_Category#getCategoryType()
	 * @see #getPRS_Category()
	 * @generated
	 */
	EAttribute getPRS_Category_CategoryType();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_CategoryParentChild <em>PRS Category Parent Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Category Parent Child</em>'.
	 * @see org.dmtf.prs.PRS_CategoryParentChild
	 * @generated
	 */
	EClass getPRS_CategoryParentChild();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Contact <em>PRS Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact</em>'.
	 * @see org.dmtf.prs.PRS_Contact
	 * @generated
	 */
	EClass getPRS_Contact();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ContactItem <em>PRS Contact Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact Item</em>'.
	 * @see org.dmtf.prs.PRS_ContactItem
	 * @generated
	 */
	EClass getPRS_ContactItem();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ContactItemAddress <em>PRS Contact Item Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact Item Address</em>'.
	 * @see org.dmtf.prs.PRS_ContactItemAddress
	 * @generated
	 */
	EClass getPRS_ContactItemAddress();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Expression <em>PRS Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Expression</em>'.
	 * @see org.dmtf.prs.PRS_Expression
	 * @generated
	 */
	EClass getPRS_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Expression#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see org.dmtf.prs.PRS_Expression#getRelation()
	 * @see #getPRS_Expression()
	 * @generated
	 */
	EAttribute getPRS_Expression_Relation();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ExpressionLink <em>PRS Expression Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Expression Link</em>'.
	 * @see org.dmtf.prs.PRS_ExpressionLink
	 * @generated
	 */
	EClass getPRS_ExpressionLink();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_FeatureResource <em>PRS Feature Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Feature Resource</em>'.
	 * @see org.dmtf.prs.PRS_FeatureResource
	 * @generated
	 */
	EClass getPRS_FeatureResource();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Organization <em>PRS Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Organization</em>'.
	 * @see org.dmtf.prs.PRS_Organization
	 * @generated
	 */
	EClass getPRS_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.dmtf.prs.PRS_Organization#getName()
	 * @see #getPRS_Organization()
	 * @generated
	 */
	EAttribute getPRS_Organization_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Organization#getBusiness <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business</em>'.
	 * @see org.dmtf.prs.PRS_Organization#getBusiness()
	 * @see #getPRS_Organization()
	 * @generated
	 */
	EAttribute getPRS_Organization_Business();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Person <em>PRS Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Person</em>'.
	 * @see org.dmtf.prs.PRS_Person
	 * @generated
	 */
	EClass getPRS_Person();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.dmtf.prs.PRS_Person#getFirstName()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.dmtf.prs.PRS_Person#getLastName()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salutation</em>'.
	 * @see org.dmtf.prs.PRS_Person#getSalutation()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.dmtf.prs.PRS_Person#getTitle()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Type</em>'.
	 * @see org.dmtf.prs.PRS_Person#getContactType()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_ContactType();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Person#getCommunicationMode <em>Communication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Mode</em>'.
	 * @see org.dmtf.prs.PRS_Person#getCommunicationMode()
	 * @see #getPRS_Person()
	 * @generated
	 */
	EAttribute getPRS_Person_CommunicationMode();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Problem <em>PRS Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Problem</em>'.
	 * @see org.dmtf.prs.PRS_Problem
	 * @generated
	 */
	EClass getPRS_Problem();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Problem#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see org.dmtf.prs.PRS_Problem#getLikelihood()
	 * @see #getPRS_Problem()
	 * @generated
	 */
	EAttribute getPRS_Problem_Likelihood();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Problem#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see org.dmtf.prs.PRS_Problem#getImpact()
	 * @see #getPRS_Problem()
	 * @generated
	 */
	EAttribute getPRS_Problem_Impact();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ProductAsset <em>PRS Product Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Product Asset</em>'.
	 * @see org.dmtf.prs.PRS_ProductAsset
	 * @generated
	 */
	EClass getPRS_ProductAsset();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ProductComponent <em>PRS Product Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Product Component</em>'.
	 * @see org.dmtf.prs.PRS_ProductComponent
	 * @generated
	 */
	EClass getPRS_ProductComponent();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ProductParentChild <em>PRS Product Parent Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Product Parent Child</em>'.
	 * @see org.dmtf.prs.PRS_ProductParentChild
	 * @generated
	 */
	EClass getPRS_ProductParentChild();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Reference <em>PRS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Reference</em>'.
	 * @see org.dmtf.prs.PRS_Reference
	 * @generated
	 */
	EClass getPRS_Reference();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Resolution <em>PRS Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Resolution</em>'.
	 * @see org.dmtf.prs.PRS_Resolution
	 * @generated
	 */
	EClass getPRS_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.dmtf.prs.PRS_Resolution#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.dmtf.prs.PRS_Resolution#getConfidence()
	 * @see #getPRS_Resolution()
	 * @generated
	 */
	EAttribute getPRS_Resolution_Confidence();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ResolutionResource <em>PRS Resolution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Resolution Resource</em>'.
	 * @see org.dmtf.prs.PRS_ResolutionResource
	 * @generated
	 */
	EClass getPRS_ResolutionResource();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_RevisionContact <em>PRS Revision Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Revision Contact</em>'.
	 * @see org.dmtf.prs.PRS_RevisionContact
	 * @generated
	 */
	EClass getPRS_RevisionContact();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceActivity <em>PRS Service Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Activity</em>'.
	 * @see org.dmtf.prs.PRS_ServiceActivity
	 * @generated
	 */
	EClass getPRS_ServiceActivity();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceAgreement <em>PRS Service Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Agreement</em>'.
	 * @see org.dmtf.prs.PRS_ServiceAgreement
	 * @generated
	 */
	EClass getPRS_ServiceAgreement();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceProblem <em>PRS Service Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Problem</em>'.
	 * @see org.dmtf.prs.PRS_ServiceProblem
	 * @generated
	 */
	EClass getPRS_ServiceProblem();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceProvider <em>PRS Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Provider</em>'.
	 * @see org.dmtf.prs.PRS_ServiceProvider
	 * @generated
	 */
	EClass getPRS_ServiceProvider();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceRequester <em>PRS Service Requester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Requester</em>'.
	 * @see org.dmtf.prs.PRS_ServiceRequester
	 * @generated
	 */
	EClass getPRS_ServiceRequester();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ServiceResolutionSolution <em>PRS Service Resolution Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Service Resolution Solution</em>'.
	 * @see org.dmtf.prs.PRS_ServiceResolutionSolution
	 * @generated
	 */
	EClass getPRS_ServiceResolutionSolution();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionCategory <em>PRS Solution Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Category</em>'.
	 * @see org.dmtf.prs.PRS_SolutionCategory
	 * @generated
	 */
	EClass getPRS_SolutionCategory();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionExpression <em>PRS Solution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Expression</em>'.
	 * @see org.dmtf.prs.PRS_SolutionExpression
	 * @generated
	 */
	EClass getPRS_SolutionExpression();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionHasElement <em>PRS Solution Has Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Has Element</em>'.
	 * @see org.dmtf.prs.PRS_SolutionHasElement
	 * @generated
	 */
	EClass getPRS_SolutionHasElement();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionProblem <em>PRS Solution Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Problem</em>'.
	 * @see org.dmtf.prs.PRS_SolutionProblem
	 * @generated
	 */
	EClass getPRS_SolutionProblem();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionReference <em>PRS Solution Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Reference</em>'.
	 * @see org.dmtf.prs.PRS_SolutionReference
	 * @generated
	 */
	EClass getPRS_SolutionReference();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SolutionResolution <em>PRS Solution Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Solution Resolution</em>'.
	 * @see org.dmtf.prs.PRS_SolutionResolution
	 * @generated
	 */
	EClass getPRS_SolutionResolution();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_StatementFeature <em>PRS Statement Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Statement Feature</em>'.
	 * @see org.dmtf.prs.PRS_StatementFeature
	 * @generated
	 */
	EClass getPRS_StatementFeature();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ActivityContact <em>PRS Activity Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Activity Contact</em>'.
	 * @see org.dmtf.prs.PRS_ActivityContact
	 * @generated
	 */
	EClass getPRS_ActivityContact();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_AdminAssociation <em>PRS Admin Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Admin Association</em>'.
	 * @see org.dmtf.prs.PRS_AdminAssociation
	 * @generated
	 */
	EClass getPRS_AdminAssociation();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_AdministrativeContact <em>PRS Administrative Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Administrative Contact</em>'.
	 * @see org.dmtf.prs.PRS_AdministrativeContact
	 * @generated
	 */
	EClass getPRS_AdministrativeContact();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Attached <em>PRS Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Attached</em>'.
	 * @see org.dmtf.prs.PRS_Attached
	 * @generated
	 */
	EClass getPRS_Attached();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_Categorization <em>PRS Categorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Categorization</em>'.
	 * @see org.dmtf.prs.PRS_Categorization
	 * @generated
	 */
	EClass getPRS_Categorization();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ContactContactItem <em>PRS Contact Contact Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact Contact Item</em>'.
	 * @see org.dmtf.prs.PRS_ContactContactItem
	 * @generated
	 */
	EClass getPRS_ContactContactItem();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ContactOrganization <em>PRS Contact Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact Organization</em>'.
	 * @see org.dmtf.prs.PRS_ContactOrganization
	 * @generated
	 */
	EClass getPRS_ContactOrganization();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_ContactPerson <em>PRS Contact Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS Contact Person</em>'.
	 * @see org.dmtf.prs.PRS_ContactPerson
	 * @generated
	 */
	EClass getPRS_ContactPerson();

	/**
	 * Returns the meta object for class '{@link org.dmtf.prs.PRS_SISService <em>PRS SIS Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRS SIS Service</em>'.
	 * @see org.dmtf.prs.PRS_SISService
	 * @generated
	 */
	EClass getPRS_SISService();

	/**
	 * Returns the meta object for the '{@link org.dmtf.prs.PRS_SISService#StartSISTransaction(java.lang.Integer, org.dmtf.prs.PRS_Activity, org.dmtf.prs.PRS_Transaction) <em>Start SIS Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start SIS Transaction</em>' operation.
	 * @see org.dmtf.prs.PRS_SISService#StartSISTransaction(java.lang.Integer, org.dmtf.prs.PRS_Activity, org.dmtf.prs.PRS_Transaction)
	 * @generated
	 */
	EOperation getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction();

	/**
	 * Returns the meta object for the '{@link org.dmtf.prs.PRS_SISService#EndSISTransaction(java.lang.Long, org.dmtf.prs.PRS_Transaction) <em>End SIS Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End SIS Transaction</em>' operation.
	 * @see org.dmtf.prs.PRS_SISService#EndSISTransaction(java.lang.Long, org.dmtf.prs.PRS_Transaction)
	 * @generated
	 */
	EOperation getPRS_SISService__EndSISTransaction__Long_PRS_Transaction();

	/**
	 * Returns the meta object for the '{@link org.dmtf.prs.PRS_SISService#SetSISCompletionStatus(java.lang.Long, org.dmtf.prs.PRS_Transaction) <em>Set SIS Completion Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set SIS Completion Status</em>' operation.
	 * @see org.dmtf.prs.PRS_SISService#SetSISCompletionStatus(java.lang.Long, org.dmtf.prs.PRS_Transaction)
	 * @generated
	 */
	EOperation getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrsFactory getPrsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ExchangeElementImpl <em>PRS Exchange Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ExchangeElementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExchangeElement()
		 * @generated
		 */
		EClass PRS_EXCHANGE_ELEMENT = eINSTANCE.getPRS_ExchangeElement();

		/**
		 * The meta object literal for the '<em><b>PRS Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME = eINSTANCE.getPRS_ExchangeElement_PRSUniqueName();

		/**
		 * The meta object literal for the '<em><b>Dirty Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_EXCHANGE_ELEMENT__DIRTY_FLAG = eINSTANCE.getPRS_ExchangeElement_DirtyFlag();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ExpressionElementImpl <em>PRS Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ExpressionElementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExpressionElement()
		 * @generated
		 */
		EClass PRS_EXPRESSION_ELEMENT = eINSTANCE.getPRS_ExpressionElement();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_FeatureImpl <em>PRS Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_FeatureImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Feature()
		 * @generated
		 */
		EClass PRS_FEATURE = eINSTANCE.getPRS_Feature();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_FEATURE__PROMPT = eINSTANCE.getPRS_Feature_Prompt();

		/**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_FEATURE__VALID_VALUES = eINSTANCE.getPRS_Feature_ValidValues();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_FEATURE__DATA_TYPE = eINSTANCE.getPRS_Feature_DataType();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_LocationImpl <em>PRS Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_LocationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Location()
		 * @generated
		 */
		EClass PRS_LOCATION = eINSTANCE.getPRS_Location();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_LOCATION__LOCATION_TYPE = eINSTANCE.getPRS_Location_LocationType();

		/**
		 * The meta object literal for the '<em><b>Location ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_LOCATION__LOCATION_ID = eINSTANCE.getPRS_Location_LocationID();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ProductImpl <em>PRS Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ProductImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Product()
		 * @generated
		 */
		EClass PRS_PRODUCT = eINSTANCE.getPRS_Product();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PRODUCT__VENDOR = eINSTANCE.getPRS_Product_Vendor();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PRODUCT__PRODUCT_NAME = eINSTANCE.getPRS_Product_ProductName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PRODUCT__VERSION = eINSTANCE.getPRS_Product_Version();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PRODUCT__ORDER = eINSTANCE.getPRS_Product_Order();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ResourceImpl <em>PRS Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ResourceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Resource()
		 * @generated
		 */
		EClass PRS_RESOURCE = eINSTANCE.getPRS_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_RESOURCE__RESOURCE_TYPE = eINSTANCE.getPRS_Resource_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_RESOURCE__QUANTITY = eINSTANCE.getPRS_Resource_Quantity();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_RESOURCE__UNITS = eINSTANCE.getPRS_Resource_Units();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_RevisionImpl <em>PRS Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_RevisionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Revision()
		 * @generated
		 */
		EClass PRS_REVISION = eINSTANCE.getPRS_Revision();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_REVISION__REVISION_DATE = eINSTANCE.getPRS_Revision_RevisionDate();

		/**
		 * The meta object literal for the '<em><b>Activity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_REVISION__ACTIVITY_NAME = eINSTANCE.getPRS_Revision_ActivityName();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_REVISION__ACTIVITY_TYPE = eINSTANCE.getPRS_Revision_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Technical Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_REVISION__TECHNICAL_STATUS = eINSTANCE.getPRS_Revision_TechnicalStatus();

		/**
		 * The meta object literal for the '<em><b>Editorial Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_REVISION__EDITORIAL_STATUS = eINSTANCE.getPRS_Revision_EditorialStatus();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl <em>PRS Service Incident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceIncidentImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceIncident()
		 * @generated
		 */
		EClass PRS_SERVICE_INCIDENT = eINSTANCE.getPRS_ServiceIncident();

		/**
		 * The meta object literal for the '<em><b>Requester ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__REQUESTER_ID = eINSTANCE.getPRS_ServiceIncident_RequesterID();

		/**
		 * The meta object literal for the '<em><b>Provider ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__PROVIDER_ID = eINSTANCE.getPRS_ServiceIncident_ProviderID();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__CURRENT_STATE = eINSTANCE.getPRS_ServiceIncident_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Requester Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY = eINSTANCE.getPRS_ServiceIncident_RequesterSeverity();

		/**
		 * The meta object literal for the '<em><b>Provider Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY = eINSTANCE.getPRS_ServiceIncident_ProviderPriority();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__RESPONSE_TIME = eINSTANCE.getPRS_ServiceIncident_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Workflow Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__WORKFLOW_STATUS = eINSTANCE.getPRS_ServiceIncident_WorkflowStatus();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__COMMENT = eINSTANCE.getPRS_ServiceIncident_Comment();

		/**
		 * The meta object literal for the '<em><b>Entitled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__ENTITLED = eINSTANCE.getPRS_ServiceIncident_Entitled();

		/**
		 * The meta object literal for the '<em><b>Acknowledge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__ACKNOWLEDGE = eINSTANCE.getPRS_ServiceIncident_Acknowledge();

		/**
		 * The meta object literal for the '<em><b>Transaction Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__TRANSACTION_NAME = eINSTANCE.getPRS_ServiceIncident_TransactionName();

		/**
		 * The meta object literal for the '<em><b>Last Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SERVICE_INCIDENT__LAST_TRANSACTION = eINSTANCE.getPRS_ServiceIncident_LastTransaction();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionImpl <em>PRS Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Solution()
		 * @generated
		 */
		EClass PRS_SOLUTION = eINSTANCE.getPRS_Solution();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SOLUTION__TITLE = eINSTANCE.getPRS_Solution_Title();

		/**
		 * The meta object literal for the '<em><b>Solution Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SOLUTION__SOLUTION_ABSTRACT = eINSTANCE.getPRS_Solution_SolutionAbstract();

		/**
		 * The meta object literal for the '<em><b>Solution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_SOLUTION__SOLUTION_TYPE = eINSTANCE.getPRS_Solution_SolutionType();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionElementImpl <em>PRS Solution Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionElementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionElement()
		 * @generated
		 */
		EClass PRS_SOLUTION_ELEMENT = eINSTANCE.getPRS_SolutionElement();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_StatementImpl <em>PRS Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_StatementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Statement()
		 * @generated
		 */
		EClass PRS_STATEMENT = eINSTANCE.getPRS_Statement();

		/**
		 * The meta object literal for the '<em><b>Statement Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__STATEMENT_ROLE = eINSTANCE.getPRS_Statement_StatementRole();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__TEXT = eINSTANCE.getPRS_Statement_Text();

		/**
		 * The meta object literal for the '<em><b>Statement Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__STATEMENT_OPERATOR = eINSTANCE.getPRS_Statement_StatementOperator();

		/**
		 * The meta object literal for the '<em><b>Feature Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__FEATURE_VALUE = eINSTANCE.getPRS_Statement_FeatureValue();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__ORDER = eINSTANCE.getPRS_Statement_Order();

		/**
		 * The meta object literal for the '<em><b>Relevance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_STATEMENT__RELEVANCE = eINSTANCE.getPRS_Statement_Relevance();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_TransactionImpl <em>PRS Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_TransactionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Transaction()
		 * @generated
		 */
		EClass PRS_TRANSACTION = eINSTANCE.getPRS_Transaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_TRANSACTION__TRANSACTION_TYPE = eINSTANCE.getPRS_Transaction_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Transaction State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_TRANSACTION__TRANSACTION_STATE = eINSTANCE.getPRS_Transaction_TransactionState();

		/**
		 * The meta object literal for the '<em><b>Completion Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_TRANSACTION__COMPLETION_STATUS = eINSTANCE.getPRS_Transaction_CompletionStatus();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ActivityImpl <em>PRS Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ActivityImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Activity()
		 * @generated
		 */
		EClass PRS_ACTIVITY = eINSTANCE.getPRS_Activity();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__PARAMETER_LIST = eINSTANCE.getPRS_Activity_ParameterList();

		/**
		 * The meta object literal for the '<em><b>New Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__NEW_KEYS = eINSTANCE.getPRS_Activity_NewKeys();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__DELETED = eINSTANCE.getPRS_Activity_Deleted();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__MODIFIED = eINSTANCE.getPRS_Activity_Modified();

		/**
		 * The meta object literal for the '<em><b>Local Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__LOCAL_DATE = eINSTANCE.getPRS_Activity_LocalDate();

		/**
		 * The meta object literal for the '<em><b>Action Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ACTIVITY__ACTION_LOG = eINSTANCE.getPRS_Activity_ActionLog();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ActivityResourceImpl <em>PRS Activity Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ActivityResourceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityResource()
		 * @generated
		 */
		EClass PRS_ACTIVITY_RESOURCE = eINSTANCE.getPRS_ActivityResource();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ActivityTransactionImpl <em>PRS Activity Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ActivityTransactionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityTransaction()
		 * @generated
		 */
		EClass PRS_ACTIVITY_TRANSACTION = eINSTANCE.getPRS_ActivityTransaction();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AddressImpl <em>PRS Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AddressImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Address()
		 * @generated
		 */
		EClass PRS_ADDRESS = eINSTANCE.getPRS_Address();

		/**
		 * The meta object literal for the '<em><b>Address Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__ADDRESS_TYPE = eINSTANCE.getPRS_Address_AddressType();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__ADDRESS1 = eINSTANCE.getPRS_Address_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__ADDRESS2 = eINSTANCE.getPRS_Address_Address2();

		/**
		 * The meta object literal for the '<em><b>Address3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__ADDRESS3 = eINSTANCE.getPRS_Address_Address3();

		/**
		 * The meta object literal for the '<em><b>Address4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__ADDRESS4 = eINSTANCE.getPRS_Address_Address4();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__CITY = eINSTANCE.getPRS_Address_City();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__REGION = eINSTANCE.getPRS_Address_Region();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__POSTAL_CODE = eINSTANCE.getPRS_Address_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__TIME_ZONE = eINSTANCE.getPRS_Address_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADDRESS__COUNTRY = eINSTANCE.getPRS_Address_Country();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AddressLocationImpl <em>PRS Address Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AddressLocationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AddressLocation()
		 * @generated
		 */
		EClass PRS_ADDRESS_LOCATION = eINSTANCE.getPRS_AddressLocation();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AdministrativeImpl <em>PRS Administrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AdministrativeImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Administrative()
		 * @generated
		 */
		EClass PRS_ADMINISTRATIVE = eINSTANCE.getPRS_Administrative();

		/**
		 * The meta object literal for the '<em><b>Compliance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL = eINSTANCE.getPRS_Administrative_ComplianceLevel();

		/**
		 * The meta object literal for the '<em><b>Document Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__DOCUMENT_STATUS = eINSTANCE.getPRS_Administrative_DocumentStatus();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__DISTRIBUTION = eINSTANCE.getPRS_Administrative_Distribution();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__LANGUAGE = eINSTANCE.getPRS_Administrative_Language();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__COPYRIGHT = eINSTANCE.getPRS_Administrative_Copyright();

		/**
		 * The meta object literal for the '<em><b>Disclaimer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__DISCLAIMER = eINSTANCE.getPRS_Administrative_Disclaimer();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ADMINISTRATIVE__RIGHTS = eINSTANCE.getPRS_Administrative_Rights();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AdministrativeRevisionImpl <em>PRS Administrative Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AdministrativeRevisionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdministrativeRevision()
		 * @generated
		 */
		EClass PRS_ADMINISTRATIVE_REVISION = eINSTANCE.getPRS_AdministrativeRevision();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AgreementImpl <em>PRS Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AgreementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Agreement()
		 * @generated
		 */
		EClass PRS_AGREEMENT = eINSTANCE.getPRS_Agreement();

		/**
		 * The meta object literal for the '<em><b>Contract ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_AGREEMENT__CONTRACT_ID = eINSTANCE.getPRS_Agreement_ContractID();

		/**
		 * The meta object literal for the '<em><b>Agreement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_AGREEMENT__AGREEMENT_TYPE = eINSTANCE.getPRS_Agreement_AgreementType();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AttachmentImpl <em>PRS Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AttachmentImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Attachment()
		 * @generated
		 */
		EClass PRS_ATTACHMENT = eINSTANCE.getPRS_Attachment();

		/**
		 * The meta object literal for the '<em><b>Attachment Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__ATTACHMENT_REFERENCE = eINSTANCE.getPRS_Attachment_AttachmentReference();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__PROTOCOL = eINSTANCE.getPRS_Attachment_Protocol();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__FORMAT = eINSTANCE.getPRS_Attachment_Format();

		/**
		 * The meta object literal for the '<em><b>Attachment Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__ATTACHMENT_SIZE = eINSTANCE.getPRS_Attachment_AttachmentSize();

		/**
		 * The meta object literal for the '<em><b>Attachment Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__ATTACHMENT_OBJECT = eINSTANCE.getPRS_Attachment_AttachmentObject();

		/**
		 * The meta object literal for the '<em><b>Attachment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__ATTACHMENT_TYPE = eINSTANCE.getPRS_Attachment_AttachmentType();

		/**
		 * The meta object literal for the '<em><b>Attachment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ATTACHMENT__ATTACHMENT_NAME = eINSTANCE.getPRS_Attachment_AttachmentName();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_CategoryImpl <em>PRS Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_CategoryImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Category()
		 * @generated
		 */
		EClass PRS_CATEGORY = eINSTANCE.getPRS_Category();

		/**
		 * The meta object literal for the '<em><b>Category Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_CATEGORY__CATEGORY_CONTENTS = eINSTANCE.getPRS_Category_CategoryContents();

		/**
		 * The meta object literal for the '<em><b>Category Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_CATEGORY__CATEGORY_TYPE = eINSTANCE.getPRS_Category_CategoryType();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_CategoryParentChildImpl <em>PRS Category Parent Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_CategoryParentChildImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_CategoryParentChild()
		 * @generated
		 */
		EClass PRS_CATEGORY_PARENT_CHILD = eINSTANCE.getPRS_CategoryParentChild();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactImpl <em>PRS Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Contact()
		 * @generated
		 */
		EClass PRS_CONTACT = eINSTANCE.getPRS_Contact();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactItemImpl <em>PRS Contact Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactItemImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactItem()
		 * @generated
		 */
		EClass PRS_CONTACT_ITEM = eINSTANCE.getPRS_ContactItem();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactItemAddressImpl <em>PRS Contact Item Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactItemAddressImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactItemAddress()
		 * @generated
		 */
		EClass PRS_CONTACT_ITEM_ADDRESS = eINSTANCE.getPRS_ContactItemAddress();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ExpressionImpl <em>PRS Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ExpressionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Expression()
		 * @generated
		 */
		EClass PRS_EXPRESSION = eINSTANCE.getPRS_Expression();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_EXPRESSION__RELATION = eINSTANCE.getPRS_Expression_Relation();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ExpressionLinkImpl <em>PRS Expression Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ExpressionLinkImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ExpressionLink()
		 * @generated
		 */
		EClass PRS_EXPRESSION_LINK = eINSTANCE.getPRS_ExpressionLink();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_FeatureResourceImpl <em>PRS Feature Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_FeatureResourceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_FeatureResource()
		 * @generated
		 */
		EClass PRS_FEATURE_RESOURCE = eINSTANCE.getPRS_FeatureResource();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_OrganizationImpl <em>PRS Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_OrganizationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Organization()
		 * @generated
		 */
		EClass PRS_ORGANIZATION = eINSTANCE.getPRS_Organization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ORGANIZATION__NAME = eINSTANCE.getPRS_Organization_Name();

		/**
		 * The meta object literal for the '<em><b>Business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_ORGANIZATION__BUSINESS = eINSTANCE.getPRS_Organization_Business();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_PersonImpl <em>PRS Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_PersonImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Person()
		 * @generated
		 */
		EClass PRS_PERSON = eINSTANCE.getPRS_Person();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__FIRST_NAME = eINSTANCE.getPRS_Person_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__LAST_NAME = eINSTANCE.getPRS_Person_LastName();

		/**
		 * The meta object literal for the '<em><b>Salutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__SALUTATION = eINSTANCE.getPRS_Person_Salutation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__TITLE = eINSTANCE.getPRS_Person_Title();

		/**
		 * The meta object literal for the '<em><b>Contact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__CONTACT_TYPE = eINSTANCE.getPRS_Person_ContactType();

		/**
		 * The meta object literal for the '<em><b>Communication Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PERSON__COMMUNICATION_MODE = eINSTANCE.getPRS_Person_CommunicationMode();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ProblemImpl <em>PRS Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ProblemImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Problem()
		 * @generated
		 */
		EClass PRS_PROBLEM = eINSTANCE.getPRS_Problem();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PROBLEM__LIKELIHOOD = eINSTANCE.getPRS_Problem_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_PROBLEM__IMPACT = eINSTANCE.getPRS_Problem_Impact();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ProductAssetImpl <em>PRS Product Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ProductAssetImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductAsset()
		 * @generated
		 */
		EClass PRS_PRODUCT_ASSET = eINSTANCE.getPRS_ProductAsset();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ProductComponentImpl <em>PRS Product Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ProductComponentImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductComponent()
		 * @generated
		 */
		EClass PRS_PRODUCT_COMPONENT = eINSTANCE.getPRS_ProductComponent();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ProductParentChildImpl <em>PRS Product Parent Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ProductParentChildImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ProductParentChild()
		 * @generated
		 */
		EClass PRS_PRODUCT_PARENT_CHILD = eINSTANCE.getPRS_ProductParentChild();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ReferenceImpl <em>PRS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ReferenceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Reference()
		 * @generated
		 */
		EClass PRS_REFERENCE = eINSTANCE.getPRS_Reference();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ResolutionImpl <em>PRS Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ResolutionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Resolution()
		 * @generated
		 */
		EClass PRS_RESOLUTION = eINSTANCE.getPRS_Resolution();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRS_RESOLUTION__CONFIDENCE = eINSTANCE.getPRS_Resolution_Confidence();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ResolutionResourceImpl <em>PRS Resolution Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ResolutionResourceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ResolutionResource()
		 * @generated
		 */
		EClass PRS_RESOLUTION_RESOURCE = eINSTANCE.getPRS_ResolutionResource();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_RevisionContactImpl <em>PRS Revision Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_RevisionContactImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_RevisionContact()
		 * @generated
		 */
		EClass PRS_REVISION_CONTACT = eINSTANCE.getPRS_RevisionContact();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceActivityImpl <em>PRS Service Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceActivityImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceActivity()
		 * @generated
		 */
		EClass PRS_SERVICE_ACTIVITY = eINSTANCE.getPRS_ServiceActivity();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceAgreementImpl <em>PRS Service Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceAgreementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceAgreement()
		 * @generated
		 */
		EClass PRS_SERVICE_AGREEMENT = eINSTANCE.getPRS_ServiceAgreement();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceProblemImpl <em>PRS Service Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceProblemImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceProblem()
		 * @generated
		 */
		EClass PRS_SERVICE_PROBLEM = eINSTANCE.getPRS_ServiceProblem();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceProviderImpl <em>PRS Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceProviderImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceProvider()
		 * @generated
		 */
		EClass PRS_SERVICE_PROVIDER = eINSTANCE.getPRS_ServiceProvider();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceRequesterImpl <em>PRS Service Requester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceRequesterImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceRequester()
		 * @generated
		 */
		EClass PRS_SERVICE_REQUESTER = eINSTANCE.getPRS_ServiceRequester();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ServiceResolutionSolutionImpl <em>PRS Service Resolution Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ServiceResolutionSolutionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ServiceResolutionSolution()
		 * @generated
		 */
		EClass PRS_SERVICE_RESOLUTION_SOLUTION = eINSTANCE.getPRS_ServiceResolutionSolution();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionCategoryImpl <em>PRS Solution Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionCategoryImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionCategory()
		 * @generated
		 */
		EClass PRS_SOLUTION_CATEGORY = eINSTANCE.getPRS_SolutionCategory();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionExpressionImpl <em>PRS Solution Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionExpressionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionExpression()
		 * @generated
		 */
		EClass PRS_SOLUTION_EXPRESSION = eINSTANCE.getPRS_SolutionExpression();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionHasElementImpl <em>PRS Solution Has Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionHasElementImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionHasElement()
		 * @generated
		 */
		EClass PRS_SOLUTION_HAS_ELEMENT = eINSTANCE.getPRS_SolutionHasElement();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionProblemImpl <em>PRS Solution Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionProblemImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionProblem()
		 * @generated
		 */
		EClass PRS_SOLUTION_PROBLEM = eINSTANCE.getPRS_SolutionProblem();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionReferenceImpl <em>PRS Solution Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionReferenceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionReference()
		 * @generated
		 */
		EClass PRS_SOLUTION_REFERENCE = eINSTANCE.getPRS_SolutionReference();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SolutionResolutionImpl <em>PRS Solution Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SolutionResolutionImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SolutionResolution()
		 * @generated
		 */
		EClass PRS_SOLUTION_RESOLUTION = eINSTANCE.getPRS_SolutionResolution();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_StatementFeatureImpl <em>PRS Statement Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_StatementFeatureImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_StatementFeature()
		 * @generated
		 */
		EClass PRS_STATEMENT_FEATURE = eINSTANCE.getPRS_StatementFeature();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ActivityContactImpl <em>PRS Activity Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ActivityContactImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ActivityContact()
		 * @generated
		 */
		EClass PRS_ACTIVITY_CONTACT = eINSTANCE.getPRS_ActivityContact();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AdminAssociationImpl <em>PRS Admin Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AdminAssociationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdminAssociation()
		 * @generated
		 */
		EClass PRS_ADMIN_ASSOCIATION = eINSTANCE.getPRS_AdminAssociation();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AdministrativeContactImpl <em>PRS Administrative Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AdministrativeContactImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_AdministrativeContact()
		 * @generated
		 */
		EClass PRS_ADMINISTRATIVE_CONTACT = eINSTANCE.getPRS_AdministrativeContact();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_AttachedImpl <em>PRS Attached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_AttachedImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Attached()
		 * @generated
		 */
		EClass PRS_ATTACHED = eINSTANCE.getPRS_Attached();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_CategorizationImpl <em>PRS Categorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_CategorizationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_Categorization()
		 * @generated
		 */
		EClass PRS_CATEGORIZATION = eINSTANCE.getPRS_Categorization();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactContactItemImpl <em>PRS Contact Contact Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactContactItemImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactContactItem()
		 * @generated
		 */
		EClass PRS_CONTACT_CONTACT_ITEM = eINSTANCE.getPRS_ContactContactItem();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactOrganizationImpl <em>PRS Contact Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactOrganizationImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactOrganization()
		 * @generated
		 */
		EClass PRS_CONTACT_ORGANIZATION = eINSTANCE.getPRS_ContactOrganization();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_ContactPersonImpl <em>PRS Contact Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_ContactPersonImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_ContactPerson()
		 * @generated
		 */
		EClass PRS_CONTACT_PERSON = eINSTANCE.getPRS_ContactPerson();

		/**
		 * The meta object literal for the '{@link org.dmtf.prs.impl.PRS_SISServiceImpl <em>PRS SIS Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dmtf.prs.impl.PRS_SISServiceImpl
		 * @see org.dmtf.prs.impl.PrsPackageImpl#getPRS_SISService()
		 * @generated
		 */
		EClass PRS_SIS_SERVICE = eINSTANCE.getPRS_SISService();

		/**
		 * The meta object literal for the '<em><b>Start SIS Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRS_SIS_SERVICE___START_SIS_TRANSACTION__INTEGER_PRS_ACTIVITY_PRS_TRANSACTION = eINSTANCE.getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction();

		/**
		 * The meta object literal for the '<em><b>End SIS Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRS_SIS_SERVICE___END_SIS_TRANSACTION__LONG_PRS_TRANSACTION = eINSTANCE.getPRS_SISService__EndSISTransaction__Long_PRS_Transaction();

		/**
		 * The meta object literal for the '<em><b>Set SIS Completion Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRS_SIS_SERVICE___SET_SIS_COMPLETION_STATUS__LONG_PRS_TRANSACTION = eINSTANCE.getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction();

	}

} //PrsPackage
