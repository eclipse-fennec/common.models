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
 * A representation of the model object '<em><b>CIM Printer Servicing Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates that a Printer is currently servicing a particular PrintJob.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrinterServicingJob()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::Printing' override.Antecedent='CIM_Printer REF' override.Antecedent.Description='The destination Printer for a PrintJob.' override.Dependent='CIM_PrintJob REF' override.Dependent.Description='The PrintJob.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PrinterServicingJob extends CIM_Dependency {
} // CIM_PrinterServicingJob
