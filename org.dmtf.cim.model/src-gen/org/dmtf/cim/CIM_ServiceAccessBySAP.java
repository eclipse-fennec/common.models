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
 * A representation of the model object '<em><b>CIM Service Access By SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceAccessBySAP is an association that identifies the access points for a Service. For example, a printer might be accessed by NetWare, MacIntosh or Windows ServiceAccessPoints, which might all be hosted on different Systems.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAccessBySAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_Service REF' override.Antecedent.Description='The Service.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='An Access Point for a Service. Access points are dependent in this relationship because they have no function without a corresponding Service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAccessBySAP extends CIM_Dependency {
} // CIM_ServiceAccessBySAP
