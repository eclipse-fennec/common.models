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
 * A representation of the model object '<em><b>CIM Queue Forwards To Print SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates that the Jobs from a PrintQueue can be sent to the referenced PrintSAP, to be handled by the backing PrintService of the SAP.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueueForwardsToPrintSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Printing' override.Antecedent='CIM_PrintSAP REF' override.Antecedent.Description='The PrintSAP for the PrintService.' override.Dependent='CIM_PrintQueue REF' override.Dependent.Description='The PrintQueue that forwards Jobs to the SAP.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_QueueForwardsToPrintSAP extends CIM_Dependency {
} // CIM_QueueForwardsToPrintSAP
