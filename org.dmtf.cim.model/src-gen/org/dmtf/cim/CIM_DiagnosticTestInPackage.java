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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Diagnostic Test In Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated. Tests should be grouped at the test level, not in the model. Therefore, the association is not appropriate. /n This is an association class that identifies a Diagnostic Test as made up of lower level Tests. In this case, the test identified as the GroupComponent reference (i.e, the higher level test) would have the "Is Package" enumerated value specified in DiagnosticTest. Characteristics.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTestInPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::System::Diagnostics' override.GroupComponent='CIM_DiagnosticTest REF' override.GroupComponent.Deprecated='[\"No value\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The DiagnosticTest object that acts as the container for all the tests of the package.' override.PartComponent='CIM_DiagnosticTest REF' override.PartComponent.Deprecated='[\"No value\"]' override.PartComponent.Description='The DiagnosticTest object that is one of the elements of the package.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticTestInPackage extends CIM_Component {
} // CIM_DiagnosticTestInPackage
